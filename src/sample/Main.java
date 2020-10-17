package sample;

import Model.Athlete;
import Model.Competition;
import Model.PersonalCompetition;
import Model.Runner;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    Button button1, button2, button3, button4, button5, button6, button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
    Scene s1, s2,s3,s4,s5,s6,s7,s8;
    Stage MainWindow;
    private TableView table,table2,table3,table4;
    private ObservableList data,data2,data3,data4;
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
        button2 = new Button(" Stadium 1");
        button3 = new Button("Stadium 2 ");
        button4 = new Button("Stadium 3");
        button5 = new Button("Stadium 4");
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
                Display_new_window(controller.getCompetitions().get(0),primaryStage));
        button3.setOnAction(e ->  Display_new_window(controller.getCompetitions().get(1),primaryStage));
        button4.setOnAction(e ->   Display_new_window(controller.getCompetitions().get(2),primaryStage));
        button5.setOnAction(e ->   Display_new_window(controller.getCompetitions().get(3),primaryStage));
        button6.setOnAction(e -> getWinners(primaryStage));

        button1.setOnAction(e -> primaryStage.setScene(s2));

        layout2.getChildren().addAll(button2, button3, button4, button5, button6, stadiumView1, stadiumView2, stadiumView3, stadiumView4);

        s2 = new Scene(layout2, 700, 600);




        primaryStage.show();
    }

    private void getWinners(Stage primaryStage) {
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        controller.spain2020.getWinnersInOlympicsByCountriesCompetitions();
        Label l3 = new Label();
        l3.setText(controller.spain2020.getCountries().get(0).toString());
        Label l4 = new Label();
        l4.setText(controller.spain2020.getCountries().get(1).toString());
        Label l5 = new Label();
        l5.setText(controller.spain2020.getCountries().get(2).toString());
        button13 = new Button("previous");
        button14 = new Button("Finish");
        button13.setOnAction(e -> primaryStage.setScene(s2) );
        button14.setOnAction(e -> primaryStage.close());


        gp.add(l3,1,2);
        gp.add(l4,0,2);
        gp.add(l5,2,2);
        gp.add(button13,3,0);
        gp.add(button14,3,2);
        Image imageView5 = new Image(getClass().getResourceAsStream("podium.png"));
        ImageView stadiumView5 = new ImageView(imageView5);
        stadiumView5.setImage(imageView5);

        s6 = new Scene(gp,700,600);
        primaryStage.setScene(s6);

    }

    public void Display_new_window( Competition competition,Stage primaryStage) {
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


        table.getColumns().setAll(titleCol, authorCol,titleCol2,titleCol3,titleCol4,numOfMeda);
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
        vbox2.setPadding(new Insets(12, 12, 12, 12));;
        vbox2.getChildren().addAll(hb, table, actionStatus,button10);

        // Scene
        s7 = new Scene(vbox2, 500, 475); // w x h


        Label label2 = new Label("Winners");
        label2.setTextFill(Color.DARKBLUE);
        label2.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb2 = new HBox();
        hb2.setAlignment(Pos.CENTER);
        hb2.getChildren().add(label2);
        table2 = new TableView();
        data2 = controller.spain2020.getWinnersInSpecificCompetition(competition);
        table2.setItems(data2);

        TableColumn nameCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn ageCol = new TableColumn("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn genderCol = new TableColumn("Gender");
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn speedCol = new TableColumn("Speed");
        speedCol.setCellValueFactory(new PropertyValueFactory("highestSpeed"));
        TableColumn jumpingCol = new TableColumn("Jumping");
        jumpingCol.setCellValueFactory(new PropertyValueFactory("highestJumping"));
        TableColumn numOfMedalsCol = new TableColumn("Medals");
        numOfMedalsCol.setCellValueFactory(new PropertyValueFactory("numOfMedals"));
        TableColumn countrycol = new TableColumn("Country");
        countrycol.setCellValueFactory(new PropertyValueFactory("country"));


        table2.getColumns().setAll(nameCol, ageCol,genderCol,speedCol,jumpingCol,numOfMedalsCol,countrycol);
        table2.setPrefWidth(450);
        table2.setPrefHeight(300);
        table2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        button11 = new Button("previous");
        button11.setOnAction(e -> primaryStage.setScene(s3));


        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox3= new VBox(20);
        vbox3.setPadding(new Insets(25, 25, 25, 25));;
        vbox3.getChildren().addAll(hb2, table2, actionStatus,button11);

        // Scene
        s5 = new Scene(vbox3, 500, 475); // w x h


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


        table3.getColumns().setAll(teamName,sportType);
        table3.setPrefWidth(450);
        table3.setPrefHeight(300);
        table3.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        button15 = new Button("previous");
        button15.setOnAction(e -> primaryStage.setScene(s3));



        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox4= new VBox(20);
        vbox4.setPadding(new Insets(25, 25, 25, 25));;
        vbox4.getChildren().addAll(hb3, table3, actionStatus,button15);

        // Scene
        s4 = new Scene(vbox4, 500, 475); // w x h


        Label label4 = new Label("Team Winners");
        label4.setTextFill(Color.DARKBLUE);
        label4.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb4 = new HBox();
        hb4.setAlignment(Pos.CENTER);
        hb4.getChildren().add(label4);
        table4 = new TableView();
        data4 = controller.spain2020.getWinnersInSpecificCompetition(competition);
        table4.setItems(data4);

        TableColumn winnerTeamName = new TableColumn("Name");
        winnerTeamName.setCellValueFactory(new PropertyValueFactory("teamName"));
        TableColumn sportTypeWinner = new TableColumn("SportType");
        sportTypeWinner.setCellValueFactory(new PropertyValueFactory("sportTypes"));
        TableColumn medalsTeam = new TableColumn("Medals");
        medalsTeam.setCellValueFactory(new PropertyValueFactory("numOfTeamsMedals"));

        table4.getColumns().setAll(teamName,sportType,medalsTeam);
        table4.setPrefWidth(450);
        table4.setPrefHeight(300);
        table4.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        button16 = new Button("previous");
        button16.setOnAction(e -> primaryStage.setScene(s3));



        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox5= new VBox(20);
        vbox5.setPadding(new Insets(25, 25, 25, 25));;
        vbox5.getChildren().addAll(hb4, table4, actionStatus,button16);

        // Scene
        s8 = new Scene(vbox5, 500, 475); // w x h




        button8 = new Button("Show participants ");
         button9 = new Button("Start Competition");
        button12 = new Button("previous");
        button7.setFont(new Font("David", 10));
        button7.setAlignment(Pos.BOTTOM_RIGHT);
        button7.setOnAction(e ->  primaryStage.setScene(s2));

        button9.setOnAction(e -> getWinnersInCompetition(competition,primaryStage) );
        button8.setOnAction(e ->getTypeOfCompetition(competition,primaryStage));
        button12.setOnAction(e -> primaryStage.setScene(s3));
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().addAll(button8,button9,button7);
        s3 =new Scene(vbox,600,700);

//        VBox vBox3 = new VBox(20);
//        vBox3.getChildren().addAll(l2,button12);
//        s5 = new Scene(vBox3,600,700);
        primaryStage.setScene(s3);
        primaryStage.show();

    }

    private void getWinnersInCompetition(Competition competition, Stage primaryStage) {
        if(competition instanceof PersonalCompetition)
            primaryStage.setScene(s5) ;
        else{
            primaryStage.setScene(s8);
        }
    }

    private void getTypeOfCompetition(Competition competition,Stage primaryStage) {
        if(competition instanceof PersonalCompetition)
            primaryStage.setScene(s7 );
        else{
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
