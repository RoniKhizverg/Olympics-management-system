package sample;

import Model.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends Application {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;
    Scene s1, s2, s3, s4, s5, s6, s7, s8;
    Stage MainWindow;
    private TableView table, table2, table3, table4;
    private ObservableList data, data2, data3, data4;
    private Text actionStatus;
    Controller controller = new Controller();


    public void start(Stage primaryStage) throws Exception {
        controller.getInfroInOlympics();
        MainWindow = primaryStage;
        primaryStage.setTitle("Spain2020");
        button1 = new Button("Start  the Olympic!");
        button1.setFont(new Font("David", 20));
        Label l = new Label(" Welcome to Olympic 2020 ");
        l.setFont(new Font(72));
        Image olympicImage = new Image(getClass().getResourceAsStream("olympicrings.png"));
        ImageView olympicView = new ImageView(olympicImage);
        Image stadiumImage1 = new Image(getClass().getResourceAsStream("stadium.png"));
        ImageView stadiumView1 = new ImageView(stadiumImage1);
        Image stadiumImage2 = new Image(getClass().getResourceAsStream("stadium2.png"));
        ImageView stadiumView2 = new ImageView(stadiumImage2);
        Image imageView3 = new Image(getClass().getResourceAsStream("stdium3.png"));
        ImageView stadiumView3 = new ImageView(imageView3);
        Image imageView4 = new Image(getClass().getResourceAsStream("stadium4.png"));
        ImageView stadiumView4 = new ImageView(imageView4);

        Label l2 = new Label();

        button7 = new Button("Previous");
        button2 = new Button("Jumping team competition");
        button3 = new Button("Running team competition ");
        button4 = new Button("Running competition");
        button5 = new Button("Jumping competition");
        button6 = new Button("Olympic winners");


        stadiumView1.setFitHeight(100);
        stadiumView1.setFitWidth(100);
        stadiumView2.setFitHeight(100);
        stadiumView2.setFitWidth(100);
        stadiumView3.setFitHeight(100);
        stadiumView3.setFitWidth(100);
        stadiumView4.setFitHeight(100);
        stadiumView4.setFitWidth(100);


        button1.setGraphic(olympicView);
        VBox layoutInMainWindow = new VBox(200);
        layoutInMainWindow.getChildren().addAll(l, olympicView, button1);
        layoutInMainWindow.setAlignment(Pos.CENTER);
        s1 = new Scene(layoutInMainWindow, 700, 500);
        primaryStage.setScene(s1);
        primaryStage.setFullScreen(true);
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            try {
                CloseProgram();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });


        button2.setGraphic(stadiumView1);
        button3.setGraphic(stadiumView2);
        button4.setGraphic(stadiumView3);
        button5.setGraphic(stadiumView4);


        VBox layout2 = new VBox(20);
        layout2.setAlignment(Pos.CENTER);
        button2.setOnAction(e ->
                Display_new_window(controller.getCompetitions().get(0), primaryStage));
        button3.setOnAction(e -> Display_new_window(controller.getCompetitions().get(1), primaryStage));
        button4.setOnAction(e -> Display_new_window(controller.getCompetitions().get(2), primaryStage));
        button5.setOnAction(e -> Display_new_window(controller.getCompetitions().get(3), primaryStage));
        button6.setOnAction(e -> getWinners(primaryStage));

        button1.setOnAction(e -> primaryStage.setScene(s2));

        layout2.getChildren().addAll(button2, button3, button4, button5, button6, stadiumView1, stadiumView2, stadiumView3, stadiumView4);

        s2 = new Scene(layout2, 700, 600);


        primaryStage.show();
    }

    public void getWinners(Stage primaryStage) {
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        controller.spain2020.getWinnersInOlympicsByCountriesCompetitions();
        Label l3 = new Label();
        l3.setText(controller.spain2020.getCountries().get(0).getCountryName());
        l3.setTextFill(Color.BLACK);
        Label l4 = new Label();
        l4.setText(controller.spain2020.getCountries().get(1).getCountryName());
        l4.setTextFill(Color.BLACK);
        Label l5 = new Label();
        l5.setText(controller.spain2020.getCountries().get(2).getCountryName());
        l5.setTextFill(Color.BLACK);
        button13 = new Button("previous");
        button14 = new Button("Finish");
        button13.setOnAction(e -> primaryStage.setScene(s2));
        button14.setOnAction(e -> primaryStage.close());


        gp.add(l3, 24, 25);
        gp.add(l4, 8, 30);
        gp.add(l5, 38, 30);
        gp.add(button13, 41, 50);
        gp.add(button14, 2, 50);
        gp.setBackground(
                new Background(
                        Collections.singletonList(new BackgroundFill(
                                Color.WHITE,
                                new CornerRadii(500),
                                new Insets(10))),
                        Collections.singletonList(new BackgroundImage(
                                new Image(getClass().getResourceAsStream("podium.png"), 700, 700, false, true),
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT))));

        s6 = new Scene(gp, 700, 600);
        primaryStage.setScene(s6);

    }

    public void Display_new_window(Competition competition, Stage primaryStage) {

        Label label = new Label("Participants");
        label.setTextFill(Color.DARKBLUE);
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(label);
        table = new TableView();
        data = controller.getInitialTableData(competition);
        table.setItems(data);

        TableColumn titleCol = new TableColumn("Name");
        titleCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn authorCol = new TableColumn("Age");
        authorCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn titleCol2 = new TableColumn("Gender");
        titleCol2.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn titleCol3 = new TableColumn("highest Speed[kmh]");
        titleCol3.setCellValueFactory(new PropertyValueFactory("highestSpeed"));
        TableColumn titleCol4 = new TableColumn("highest Jump[m]");
        titleCol4.setCellValueFactory(new PropertyValueFactory("highestJumping"));
        TableColumn numOfMeda = new TableColumn("Medals");
        numOfMeda.setCellValueFactory(new PropertyValueFactory("numOfMedals"));


        table.getColumns().setAll(titleCol, authorCol, titleCol2, titleCol3, titleCol4, numOfMeda);
        table.setPrefWidth(450);
        table.setPrefHeight(300);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        button10 = new Button("previous");
        button10.setOnAction(e -> primaryStage.setScene(s2));


        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox2 = new VBox(20);
        vbox2.setPadding(new Insets(12, 12, 12, 12));
        ;
        vbox2.getChildren().addAll(hb, table, actionStatus, button10);

        // Scene
        s7 = new Scene(vbox2, 500, 475); // w x h



        Label label3 = new Label("Team Participants");
        label3.setTextFill(Color.DARKBLUE);
        label3.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb3 = new HBox();
        hb3.setAlignment(Pos.CENTER);
        hb3.getChildren().add(label3);
        table3 = new TableView();
        data3 = controller.getInitialTableData(competition);
        table3.setItems(data3);

        TableColumn teamName = new TableColumn("Name");
        teamName.setCellValueFactory(new PropertyValueFactory("teamName"));
        TableColumn sportType = new TableColumn("SportType");
        sportType.setCellValueFactory(new PropertyValueFactory("sportTypes"));


        table3.getColumns().setAll(teamName, sportType);
        table3.setPrefWidth(450);
        table3.setPrefHeight(300);
        table3.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        button15 = new Button("previous");
        button15.setOnAction(e -> primaryStage.setScene(s3));


        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox4 = new VBox(20);
        vbox4.setPadding(new Insets(25, 25, 25, 25));

        vbox4.getChildren().addAll(hb3, table3, actionStatus, button15);

        // Scene
        s4 = new Scene(vbox4, 500, 475); // w x h


        Label label10= new Label(competition.getInfo());
        button8 = new Button("Show participants ");
        button9 = new Button("Start Competition");
        button12 = new Button("previous");
        button7.setFont(new Font("David", 10));
        button7.setAlignment(Pos.BOTTOM_RIGHT);
        button7.setOnAction(e -> primaryStage.setScene(s2));

        button9.setOnAction(e -> getWinnersInCompetition(competition, primaryStage));
        button8.setOnAction(e -> getTypeOfCompetition(competition, primaryStage));
        button12.setOnAction(e -> primaryStage.setScene(s3));
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().addAll(button8, button9, button7,label10);
        s3 = new Scene(vbox, 600, 700);

        primaryStage.setScene(s3);
        primaryStage.show();

    }

    private void getWinnersInCompetition(Competition competition, Stage primaryStage) {
        if (competition instanceof PersonalCompetition)
            getWinnersInPersonalCompetition(competition,primaryStage);
        else {
            getWinnersInTeamCompetition(competition,primaryStage);
        }
    }
    public void getWinnersInTeamCompetition(Competition competition,Stage primaryStage){
        GridPane gp3 = new GridPane();
        gp3.setHgap(10);
        gp3.setVgap(10);
        controller.spain2020.getWinnersInSpecificCompetition(competition);
        Label l9 = new Label();
        l9.setText(((TeamCompetition)competition).getTeamsWinners().get(0).getTeamName());
        l9.setTextFill(Color.BLACK);
        Label l10 = new Label();
        l10.setText(((TeamCompetition)competition).getTeamsWinners().get(1).getTeamName());
        l10.setTextFill(Color.BLACK);
        Label l11 = new Label();
        l11.setText(((TeamCompetition)competition).getTeamsWinners().get(2).getTeamName());
        l11.setTextFill(Color.BLACK);
        button12 = new Button("previous");
        button12.setOnAction(e -> primaryStage.setScene(s3));


        gp3.add(l9, 24, 25);
        gp3.add(l10, 8, 30);
        gp3.add(l11, 38, 30);
        gp3.add(button12, 41, 50);
        gp3.setBackground(
                new Background(
                        Collections.singletonList(new BackgroundFill(
                                Color.WHITE,
                                new CornerRadii(500),
                                new Insets(10))),
                        Collections.singletonList(new BackgroundImage(
                                new Image(getClass().getResourceAsStream("podium.png"), 700, 700, false, true),
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT))));

        s8 = new Scene(gp3, 700, 600); // w x h
        primaryStage.setScene(s8);


    }
   public void getWinnersInPersonalCompetition(Competition competition,Stage primaryStage){
       GridPane gp2 = new GridPane();
       gp2.setHgap(10);
       gp2.setVgap(10);
       controller.spain2020.getWinnersInSpecificCompetition(competition);
       Label l6 = new Label();
       l6.setText(((PersonalCompetition)competition).getWinners().get(0).getName());
       l6.setTextFill(Color.BLACK);
       Label l7 = new Label();
       l7.setText(((PersonalCompetition)competition).getWinners().get(1).getName());
       l7.setTextFill(Color.BLACK);
       Label l8 = new Label();
       l8.setText(((PersonalCompetition)competition).getWinners().get(2).getName());
       l8.setTextFill(Color.BLACK);
       button16 = new Button("previous");
       button16.setOnAction(e -> primaryStage.setScene(s3));


       gp2.add(l6, 24, 25);
       gp2.add(l7, 8, 30);
       gp2.add(l8, 38, 30);
       gp2.add(button16, 41, 50);
       gp2.setBackground(
               new Background(
                       Collections.singletonList(new BackgroundFill(
                               Color.WHITE,
                               new CornerRadii(500),
                               new Insets(10))),
                       Collections.singletonList(new BackgroundImage(
                               new Image(getClass().getResourceAsStream("podium.png"), 700, 700, false, true),
                               BackgroundRepeat.NO_REPEAT,
                               BackgroundRepeat.NO_REPEAT,
                               BackgroundPosition.DEFAULT,
                               BackgroundSize.DEFAULT))));


       // Scene
       s5 = new Scene(gp2, 700, 600); // w x h
       primaryStage.setScene(s5);

   }

    private void getTypeOfCompetition(Competition competition, Stage primaryStage) {
        if (competition instanceof PersonalCompetition)
            primaryStage.setScene(s7);
        else {
            primaryStage.setScene(s4);
        }


    }


    private void CloseProgram() throws Exception {

        int answer = JOptionPane.showConfirmDialog(null, "Exit", "Exit? ", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_OPTION) {

            System.out.print("Closing");
            MainWindow.close();

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
