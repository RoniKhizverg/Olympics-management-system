package View;

import Model.*;
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

public class OlympicView /*extends Application*/ {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, instructionButton, button12, button13, button14, button15, button16,button17;
    private Scene s1, s2, s3, s4, s5, s6, s7, s8,instructionScene;
    private Stage MainWindow;
    private Label l2;
    private TableView table, table3;
    private ObservableList data, data3;
    private Text actionStatus;
    private int count=0;


    public Stage getMainWindow() {
        return MainWindow;
    }



    public Label getL2() {
        return l2;
    }

    public void setL2(Label l2) {
        this.l2 = l2;
    }

    public OlympicView(Stage primaryStage,Olympics olympics) throws Exception {
        instructionButton = new Button("Instruction");
        instructionButton.setOnAction(e -> getInstruction());
        MainWindow = primaryStage;
        l2 = new Label();
        l2.setFont(new Font(15));
        primaryStage.setTitle("Spain2020");
        button1 = new Button("Start  the Olympic!");
        button1.setFont(new Font("David", 30));
        Label l = new Label(" Welcome to Olympic 2020 ");
        l.setFont(new Font(55));
        Image stadiumImage1 = new Image(getClass().getResourceAsStream("stadium.png"));
        ImageView stadiumView1 = new ImageView(stadiumImage1);
        Image stadiumImage2 = new Image(getClass().getResourceAsStream("stadium2.png"));
        ImageView stadiumView2 = new ImageView(stadiumImage2);
        Image imageView3 = new Image(getClass().getResourceAsStream("stdium3.png"));
        ImageView stadiumView3 = new ImageView(imageView3);
        Image imageView4 = new Image(getClass().getResourceAsStream("stadium4.png"));
        ImageView stadiumView4 = new ImageView(imageView4);
        Image cupImage = new Image(getClass().getResourceAsStream("cup.png"));
        ImageView cupView = new ImageView(cupImage);

        cupView.setFitWidth(140);
        cupView.setFitHeight(100);

        button7 = new Button("Previous");
        button2 = new Button("Jumping team competition");
        button3 = new Button("Running team competition ");
        button4 = new Button("Running competition");
        button5 = new Button("Jumping competition");
        button6 = new Button("Olympic winners");
        button6.setFont(new Font(20));
        button6.setGraphic(cupView);
        button6.setTextFill(Color.BLACK);
        button2.setFont(new Font(15));
        button3.setFont(new Font(15));
        button4.setFont(new Font(15));
        button5.setFont(new Font(15));



        stadiumView1.setFitHeight(100);
        stadiumView1.setFitWidth(100);
        stadiumView2.setFitHeight(100);
        stadiumView2.setFitWidth(100);
        stadiumView3.setFitHeight(100);
        stadiumView3.setFitWidth(100);
        stadiumView4.setFitHeight(100);
        stadiumView4.setFitWidth(100);

        primaryStage.setResizable(false);
        VBox layoutInMainWindow = new VBox(150);
        layoutInMainWindow.setAlignment(Pos.CENTER);
        layoutInMainWindow.setBackground(new Background(
                Collections.singletonList(new BackgroundFill(
                        Color.WHITE,
                        new CornerRadii(500),
                        new Insets(10))),
                Collections.singletonList(new BackgroundImage(
                        new Image(getClass().getResourceAsStream("olympicBackGround.png"), 950, 600, false, true),
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT))));

        layoutInMainWindow.getChildren().addAll(l, button1,instructionButton,l2);
        layoutInMainWindow.setAlignment(Pos.CENTER);
        s1 = new Scene(layoutInMainWindow, 950, 760);
        primaryStage.setScene(s1);
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

        button2.setOnAction(e -> Display_new_window(olympics.getCompetitions().get(0) ));
        button3.setOnAction(e -> Display_new_window(olympics.getCompetitions().get(1)));
        button4.setOnAction(e -> Display_new_window(olympics.getCompetitions().get(2)));
        button5.setOnAction(e -> Display_new_window(olympics.getCompetitions().get(3)));
          button6.setOnAction(e -> getWinners(olympics));
          button1.setOnAction(e -> primaryStage.setScene(s2));

        layout2.setBackground(new Background(
                Collections.singletonList(new BackgroundFill(
                        Color.WHITE,
                        new CornerRadii(500),
                        new Insets(10))),
                Collections.singletonList(new BackgroundImage(
                        new Image(getClass().getResourceAsStream("olympicBackGround.png"), 950, 600, false, true),
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT))));


        layout2.getChildren().addAll(button2, button3, button4, button5, button6, stadiumView1, stadiumView2, stadiumView3, stadiumView4);

        s2 = new Scene(layout2, 950, 760);


        primaryStage.show();
    }

    public void getInstruction() {

        Label instructionLable = new Label("Operating Instructions:\n" +
                "1) Run the Olympics\n" +
                "2) Enter the competition and click on \"Start competition\"\n" +
                "3) Repeat for all competitions\n" +
                "4) In order to see which country won, click on \"Olympic winners\"\n" +
                "*In order to see the participants of each competition, enter the competition and click on \"Show participants\"");
                button17 = new Button("Previous");
                button17.setOnAction(e -> getMainWindow().setScene(s1));
                VBox instructionVbox = new VBox(20);
                instructionVbox.getChildren().addAll(instructionLable,button17);

            instructionScene = new Scene(instructionVbox,950, 760);
            getMainWindow().setScene(instructionScene);
    }

    public void getWinners(Olympics olympics) {
        GridPane gp = new GridPane();
        gp.setHgap(6);
        gp.setVgap(6);
        olympics.getWinnersInOlympicsByCountriesCompetitions();
        Label l3 = new Label();
        l3.setText(olympics.getCountries().get(0).getCountryName() + "\nNum of medals: " + olympics.getCountries().get(0).getNumOfMedals());
        l3.setTextFill(Color.BLACK);
        l3.setFont(new Font(20));
        Label l4 = new Label();
        l4.setText(olympics.getCountries().get(1).getCountryName() + "\nNum of medals: " + olympics.getCountries().get(1).getNumOfMedals());
        l4.setTextFill(Color.BLACK);
        l4.setFont(new Font(20));
        Label l5 = new Label();
        l5.setText(olympics.getCountries().get(2).getCountryName() + "\nNum of medals: " + olympics.getCountries().get(2).getNumOfMedals());
        l5.setTextFill(Color.BLACK);
        l5.setFont(new Font(20));

        button13 = new Button("previous");
        button14 = new Button("Finish");
        button13.setOnAction(e -> getMainWindow().setScene(s2));
        button14.setOnAction(e -> getMainWindow().close());


        gp.add(l3, 35, 33);
        gp.add(l4, 10, 36);
        gp.add(l5, 48, 36);
        gp.add(button13, 56, 90);
        gp.add(button14, 2, 90);
        gp.setBackground(
                new Background(
                        Collections.singletonList(new BackgroundFill(
                                Color.WHITE,
                                new CornerRadii(500),
                                new Insets(10))),
                        Collections.singletonList(new BackgroundImage(
                                new Image(getClass().getResourceAsStream("podium.png"), 950, 760, false, true),
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT))));

//        String s = "Queen_We_Are_The_Champions_Ringtone";
//        Media media = new Media(Paths.get(s).toUri().toString());
//        MediaPlayer mp = new MediaPlayer(media);
//        mp.play();
        s6 = new Scene(gp, 950, 760);
        getMainWindow().setScene(s6);

    }

    public void Display_new_window(Competition competition) {
        count=0;
        Label label = new Label("Participants");
        label.setTextFill(Color.DARKBLUE);
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(label);
        table = new TableView();
        data = getInitialTableData(competition);
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
        TableColumn fromCountry = new TableColumn("Country");
        fromCountry.setCellValueFactory(new PropertyValueFactory("fromCountry"));


        table.getColumns().setAll(titleCol, authorCol, titleCol2, titleCol3, titleCol4, numOfMeda, fromCountry);
        table.setPrefWidth(450);
        table.setPrefHeight(300);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        button10 = new Button("previous");
        button10.setOnAction(e -> getMainWindow().setScene(s2));


        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox2 = new VBox(20);
        vbox2.setPadding(new Insets(12, 12, 12, 12));

        vbox2.getChildren().addAll(hb, table, actionStatus, button10);

        // Scene
        s7 = new Scene(vbox2, 950, 760); // w x h


        Label label3 = new Label("Team Participants");
        label3.setTextFill(Color.DARKBLUE);
        label3.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb3 = new HBox();
        hb3.setAlignment(Pos.CENTER);
        hb3.getChildren().add(label3);
        table3 = new TableView();
        data3 = getInitialTableData(competition);
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
        button15.setOnAction(e -> getMainWindow().setScene(s3));


        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox4 = new VBox(20);
        vbox4.setPadding(new Insets(25, 25, 25, 25));

        vbox4.getChildren().addAll(hb3, table3, actionStatus, button15);

        // Scene
        s4 = new Scene(vbox4, 950, 760); // w x h

        Label label10 = new Label(competition.getInfo());
        label10.setFont(new Font(20));
        button8 = new Button("Show participants ");
        button8.setFont(new Font("David", 15));
        button8.setFont(new Font(20));
        button9 = new Button("Start Competition");
        button9.setFont(new Font("David", 15));
        button9.setFont(new Font(30));
        Image image = new Image(getClass().getResourceAsStream("olympicring.png"));
        ImageView olympicRing = new ImageView(image);
        olympicRing.setFitHeight(50);
        olympicRing.setFitWidth(70);
        button9.setGraphic(olympicRing);

        button7 = new Button("previous");
        button7.setFont(new Font("David", 15));
        button7.setAlignment(Pos.BOTTOM_RIGHT);
        button7.setOnAction(e -> getMainWindow().setScene(s2));

        button9.setOnAction(e ->{if(count==0) {
            checkIfButtonIspressedMoreThanOne();
        }
            getWinnersInCompetition(competition, getMainWindow());
        });
        button8.setOnAction(e -> getTypeOfCompetition(competition, getMainWindow()));
        VBox vbox6 = new VBox(150);
        vbox6.setAlignment(Pos.TOP_CENTER);
        vbox6.getChildren().addAll(label10,button8, button9, button7);

        vbox6.setBackground(
                new Background(
                        Collections.singletonList(new BackgroundFill(
                                Color.WHITE,
                                new CornerRadii(500),
                                new Insets(10))),
                        Collections.singletonList(new BackgroundImage(
                                new Image(getClass().getResourceAsStream("cmpetition.png"), 950, 760, false, true),
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT))));
        s3 = new Scene(vbox6, 950, 760);


        getMainWindow().setScene(s3);
        getMainWindow().show();

    }

    private void checkIfButtonIspressedMoreThanOne() {
        if (count == 0) {
            count++;
            button9.setVisible(false);
        }
    }

    public ObservableList getInitialTableData(Competition competition) {
        List list = new ArrayList();
        if (competition instanceof PersonalCompetition) {
            list.addAll(getAthleteInSprcificCompetition((PersonalCompetition) competition));
        } else {
            list.addAll(getTeamInSpecificCmpetition((TeamCompetition) competition));
        }

        ObservableList data = FXCollections.observableList(list);
        return data;
    }
    public List<Athlete> getAthleteInSprcificCompetition (PersonalCompetition competition){
        return competition.getPersonalCompetitionAthletes();
    }

    public List<Team> getTeamInSpecificCmpetition (TeamCompetition competition){
        return competition.getCompetitionTeams();
    }

    private void getWinnersInCompetition(Competition competition, Stage primaryStage) {
        if (competition instanceof PersonalCompetition)
            getWinnersInPersonalCompetition((PersonalCompetition) competition, primaryStage);
        else {
            getWinnersInTeamCompetition((TeamCompetition) competition, primaryStage);
        }
    }

    public void getWinnersInTeamCompetition(TeamCompetition competition, Stage primaryStage) {
        GridPane gp3 = new GridPane();
        gp3.setHgap(6);
        gp3.setVgap(6);
        Label l9 = new Label();
        l9.setText(((TeamCompetition) competition).getTeamsWinners().get(0).getTeamName());
        l9.setTextFill(Color.BLACK);
        l9.setFont(new Font(20));
        Label l10 = new Label();
        l10.setText(((TeamCompetition) competition).getTeamsWinners().get(1).getTeamName());
        l10.setTextFill(Color.BLACK);
        l10.setFont(new Font(20));
        Label l11 = new Label();
        l11.setText(((TeamCompetition) competition).getTeamsWinners().get(2).getTeamName());
        l11.setTextFill(Color.BLACK);
        l11.setFont(new Font(20));
        button12 = new Button("previous");
        button12.setOnAction(e -> primaryStage.setScene(s3));


        gp3.add(l9, 32, 35);
        gp3.add(l10, 7, 40);
        gp3.add(l11, 53, 43);
        gp3.add(button12, 2, 90);
        gp3.setBackground(
                new Background(
                        Collections.singletonList(new BackgroundFill(
                                Color.WHITE,
                                new CornerRadii(500),
                                new Insets(10))),
                        Collections.singletonList(new BackgroundImage(
                                new Image(getClass().getResourceAsStream("podium.png"), 950, 760, false, true),
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT))));

        s8 = new Scene(gp3, 950, 760); // w x h
        primaryStage.setScene(s8);

    }

    public void getWinnersInPersonalCompetition(PersonalCompetition competition, Stage primaryStage) {
        GridPane gp2 = new GridPane();
        gp2.setHgap(6);
        gp2.setVgap(6);
        Label l6 = new Label();
        l6.setText(((PersonalCompetition) competition).getWinners().get(0).getName() + "\n" + (((PersonalCompetition) competition).getWinners().get(0).getFromCountry()));
        l6.setTextFill(Color.BLACK);
        l6.setFont(new Font(20));
        Label l7 = new Label();
        l7.setText(((PersonalCompetition) competition).getWinners().get(1).getName() + "\n" + (((PersonalCompetition) competition).getWinners().get(1).getFromCountry()));
        l7.setTextFill(Color.BLACK);
        l7.setFont(new Font(20));
        Label l8 = new Label();
        l8.setText(((PersonalCompetition) competition).getWinners().get(2).getName() + "\n" + (((PersonalCompetition) competition).getWinners().get(2).getFromCountry()));
        l8.setTextFill(Color.BLACK);
        l8.setFont(new Font(20));
        button16 = new Button("previous");
        button16.setOnAction(e -> primaryStage.setScene(s3));


        gp2.add(l6, 32, 35);
        gp2.add(l7, 7, 40);
        gp2.add(l8, 58, 40);
        gp2.add(button16, 2, 90);
        gp2.setBackground(
                new Background(
                        Collections.singletonList(new BackgroundFill(
                                Color.WHITE,
                                new CornerRadii(500),
                                new Insets(10))),
                        Collections.singletonList(new BackgroundImage(
                                new Image(getClass().getResourceAsStream("podium.png"), 950, 760, false, true),
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT))));


        // Scene
        s5 = new Scene(gp2, 950, 760); // w x h
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

}
