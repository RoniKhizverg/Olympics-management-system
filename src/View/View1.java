package View;

import Model.*;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.util.Callback;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class View1 {
    private Button buildPersonalCompetition, showAthletes, buildTeamCompetition, addNewTeam, addAthleteToTeam, addAthleteToPersonalCompetition, addTeamToTeamCompetition, startCompetition, instructionButton, previous, addPersonalCompetition, finalWinners, finishButton, add, start, showExistTeams, run;
    private Scene mainScene, secondScene, thirdScene, fourthScene, newTeamScene, addAthleteToPCScene, addTeamToTC, teamWinners, instructionScene, athleteWinners, finalScene, competitionScene, showTeam;
    private Stage MainWindow;
    private GridPane gp2, parameterBox, gp4;
    private VBox frame, layoutInMainWindow, vbox, vbox2, vbox3, vbox4, vbox5, vbox6, vbox7;
    private Label dateLabel, firstWinner, secondWinner, thirdWinner, teamParticipants, firstTeamWinner, secondTeamWinner, thirdTeamWinner, firstAthleteWinner, secondAthleteWinner, thirdAthleteWinner, openingLabel = new Label(), participants;
    private TableView table, table2, table3, table4, table5, table6, table7, table8;
    private ObservableList data2, data3, data4, data5, data6, data7, data8;
    private Text actionStatus;
    private int count = 0;
    private int numOfTeamsCompetiton = 0;
    private int numofPersonalCompetition = 0;
    private int minAthletes;
    private int minTeams;
    private Date date;
    private Date endDate1;
    private String function;
    private String[] athletes, teams, startDate, endDate;
    private TextField txtField;
    private Text txtFieldtxt;
    private TextField txtField2;
    private Text txtFieldtxt2;
    private TextField txtField3;
    private Text txtFieldtxt3;
    private TextField txtField4;
    private Text txtFieldtxt4;
    private TextField txtField5;
    private Text txtFieldtxt5;
    private TextField txtField6;
    private Text txtFieldtxt6;
    private TextField txtField7;
    private Text txtFieldtxt7;
    private TextField txtField8;
    private Text txtFieldtxt8;
    private TextField txtField9;
    private Text txtFieldtxt9;
    private TextField txtField10;
    private Text txtFieldtxt10;
    private TextField txtField11;
    private Text txtFieldtxt11;
    private TextField txtField12;
    private Text txtFieldtxt12;
    private TextField txtField13;
    private Text txtFieldtxt13;
    private TextField txtField14;
    private Text txtFieldtxt14;
    private TextField txtField15;
    private Text txtFieldtxt15;
    private TextField txtField16;
    private Text txtFieldtxt16;
    private TextField txtField17;
    private Text txtFieldtxt17;
    private TextField txtField18;
    private Text txtFieldtxt18;
    private TextField txtField19;
    private Text txtFieldtxt19;
    private TextField txtField20;
    private Text txtFieldtxt20;
    private TextField txtField21;
    private TextField txtField22;
    private TextField txtField23;
    private TextField txtField24;
    private Text textField30;
    private ScrollPane sp, sp2, sp3;
    private Label label = new Label("");
    private ComboBox comboBox, comboBox2, comboBox3;
    private Text text = new Text("enter olympic name");
    private Text text2 = new Text("enter start date with (format dd/mm/yyyy)");
    private Text text3 = new Text("enter end date with (format dd/mm/yyyy)");
    private TextField textField23 = new TextField();
    private TextField textField24 = new TextField();
    private TextField textField25 = new TextField();


    public View1(Stage primaryStage) throws Exception {
        MainWindow = primaryStage;
        introduction();
        start = new Button("Start");
        comboBox = new ComboBox();
        comboBox.getItems().addAll(Team.eSportTypes.values());
        txtField = new TextField();
        txtField2 = new TextField();
        txtField3 = new TextField();
        txtField4 = new TextField();
        txtField5 = new TextField();
        txtField6 = new TextField();
        txtField7 = new TextField();
        txtField8 = new TextField();
        txtField9 = new TextField();
        txtField10 = new TextField();
        txtField11 = new TextField();
        txtField12 = new TextField();
        txtField13 = new TextField();
        txtField14 = new TextField();
        txtField15 = new TextField();
        txtField16 = new TextField();
        txtField17 = new TextField();
        txtField18 = new TextField();
        txtField19 = new TextField();
        txtField20 = new TextField();
        txtField21 = new TextField();
        txtField22 = new TextField();
        txtField23 = new TextField();
        txtField24 = new TextField();
        textField30 = new Text();
        txtFieldtxt = new Text("");
        txtFieldtxt2 = new Text("");
        txtFieldtxt3 = new Text("");
        txtFieldtxt4 = new Text("");
        txtFieldtxt5 = new Text("");
        txtFieldtxt6 = new Text("");
        txtFieldtxt7 = new Text("");
        txtFieldtxt8 = new Text("");
        txtFieldtxt9 = new Text("");
        txtFieldtxt10 = new Text("");
        txtFieldtxt11 = new Text("");
        txtFieldtxt12 = new Text("");
        txtFieldtxt13 = new Text("");
        txtFieldtxt14 = new Text("");
        txtFieldtxt15 = new Text("");
        txtFieldtxt16 = new Text("");
        txtFieldtxt17 = new Text("");
        txtFieldtxt18 = new Text("");
        txtFieldtxt19 = new Text("");
        txtFieldtxt20 = new Text("");


        table = new TableView();


        sp = new ScrollPane();
        sp2 = new ScrollPane();
        sp3 = new ScrollPane();
        frame = new VBox(10);
        sp.setFitToWidth(true);
        sp2.setFitToWidth(true);
        add = new Button("add");
        add.setPrefSize(60, 30);
        add.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        add.setPrefSize(180, 30);
        add.setStyle("-fx-background-color: #50a08d;-fx-border-color: #a0a0a0;-fx-border-width: 3 3 3 3");
        add.setTextFill(Color.WHITE);

        showExistTeams = new Button("Show exist team");
        showExistTeams.setTextFill(Color.DARKBLUE);
        showExistTeams.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        buildPersonalCompetition = new Button("build personal competition!");
        buildPersonalCompetition.setTextFill(Color.DARKBLUE);
        buildPersonalCompetition.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        showAthletes = new Button("Show exist athletes");
        showAthletes.setTextFill(Color.DARKBLUE);
        showAthletes.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        addAthleteToPersonalCompetition = new Button("add athlete to personal competition");
        addAthleteToPersonalCompetition.setTextFill(Color.DARKBLUE);
        addAthleteToPersonalCompetition.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        addTeamToTeamCompetition = new Button("add team to team competition");
        addTeamToTeamCompetition.setTextFill(Color.DARKBLUE);
        addTeamToTeamCompetition.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        previous = new Button("Previous");

        addAthleteToTeam = new Button("Add athlete to team");
        addAthleteToTeam.setTextFill(Color.DARKBLUE);
        addAthleteToTeam.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        instructionButton = new Button("Instruction");
        instructionButton.setTextFill(Color.DARKBLUE);
        instructionButton.setFont(Font.font("Calibri", FontWeight.BOLD, 15));

        buildTeamCompetition = new Button("build team competition");
        buildTeamCompetition.setTextFill(Color.DARKBLUE);
        buildTeamCompetition.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        addNewTeam = new Button("add new team ");
        addNewTeam.setTextFill(Color.DARKBLUE);
        addNewTeam.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        finalWinners = new Button("check final winners");
        Image cupImage = new Image(getClass().getResourceAsStream("cup.png"));
        ImageView cupView = new ImageView(cupImage);
        finalWinners.setGraphic(cupView);
        cupView.setFitWidth(100);
        cupView.setFitHeight(60);
        finalWinners.setTextFill(Color.DARKBLUE);
        finalWinners.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        startCompetition = new Button("Start Competition");
        addPersonalCompetition = new Button("add!");
        startCompetition.setFont(new Font("David", 15));
        startCompetition.setFont(new Font(30));


        instructionButton.setOnAction(e -> getInstruction());
        MainWindow = primaryStage;
        dateLabel = new Label();
        dateLabel.setFont(new Font(15));


        addTeamToTeamCompetition.setTextFill(Color.DARKBLUE);
        addTeamToTeamCompetition.setFont(Font.font("Calibri", FontWeight.BOLD, 25));


        addAthleteToTeam.setTextFill(Color.DARKBLUE);
        addAthleteToTeam.setFont(Font.font("Calibri", FontWeight.BOLD, 25));


        addAthleteToPersonalCompetition.setTextFill(Color.DARKBLUE);
        addAthleteToPersonalCompetition.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        if (numOfTeamsCompetiton == 0) {
            addTeamToTeamCompetition.setVisible(false);
        }
        if (numofPersonalCompetition == 0) {
            addAthleteToPersonalCompetition.setVisible(false);
        }
        if (minAthletes >= 3) {
            startCompetition.setVisible(false);
        }
        if (minTeams < 3) {
            startCompetition.setVisible(false);
        }

        primaryStage.setResizable(false);
        layoutInMainWindow = new VBox(7);
        layoutInMainWindow.setAlignment(Pos.CENTER);
        layoutInMainWindow.setBackground(new Background(
                Collections.singletonList(new BackgroundFill(
                        Color.WHITE,
                        new CornerRadii(500),
                        new Insets(10))),
                Collections.singletonList(new BackgroundImage(
                        new Image(getClass().getResourceAsStream("olympicBackGround.png"), 1000, 700, false, true),
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT))));

        Image image = new Image(getClass().getResourceAsStream("olympicring.png"));
        ImageView olympicRing = new ImageView(image);

        olympicRing.setFitHeight(50);
        olympicRing.setFitWidth(70);

        startCompetition.setGraphic(olympicRing);

        layoutInMainWindow.getChildren().addAll(buildPersonalCompetition, buildTeamCompetition, addNewTeam, addAthleteToPersonalCompetition, addTeamToTeamCompetition, startCompetition, showAthletes, showExistTeams, finalWinners, instructionButton, openingLabel);
        layoutInMainWindow.setAlignment(Pos.CENTER);
        mainScene = new Scene(layoutInMainWindow, 1000, 800);
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            try {
                CloseProgram();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        getMainWindow().show();
    }

    public void introduction() {
        function = "building the olympic!";
        run = new Button("Run");
        run.setFont(new Font(20));
        vbox = new VBox(10);
        vbox.getChildren().addAll(text, textField23, text2, textField24, text3, textField25, run);
        Scene introductionScene = new Scene(vbox, 1000, 800);
        getMainWindow().setScene(introductionScene);
    }

    public void getInstruction() {
        Label instructionLable = new Label("Operating Instructions:" +
                "\n1) Click on built personal comptiton " +
                "\n2) Choose a referee according to the type of sport of the competition and fill in the rest of the details. " +
                "\n3) Repeat according to the number of contests you want to create. Then click Back. " +
           //fuck you effi     "\n4) Now click on the add athlete to personal competition button. " +
                "\n5) Choose a number of competitions to which you would like to add athletes. * Select the number of participants you want in the competition. " +
                "\n* Write down the index number of the participants you want to add (the chapter with , )" +
                "\n* Repeat for all the individual contests you have created, then return to the main page. " +
                "\n6) Now enter the build team comptition. " +
                "\n* Fill in the details of the competition. Be sure to judge by the type of competition." +
                "\n* Repeat according to the competition tax you want. " +
                "\n7) The add new team button will now appear. " +
                "\n* Click on it, choose a name for the team (it is recommended to call it by the country name _ type of sport. " +
                "\n* Fill in the details. * Repeat for at least 3 teams for each competition. " +
                "\n* Return to the main screen. " +
                "\n8) Click add team to team comptition. " +
                "\n* Select the contest number (appears at the top of the screen) And embed the teams you have created for all the competitions you want them to participate in." +
                "\n* Return to the main screen. " +
                "\n9) Click start comptition. " +
                "\n* Select the number of contest you want to run. " +
                "\n* Repeat for all competitions. " +
                "\n10) Click on cheak final winners to see which countries won." +
                "\n11) An athlete is a runner if he has the feature of high speeding\n" +
                "An athlete is of the jumping type if he has a high jumping feature\n" +
                "An athlete who has a feature of both and both is both a runner and a jumper");

        previous.setVisible(true);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));
        VBox instructionVbox = new VBox(20);
        instructionVbox.getChildren().addAll(instructionLable, previous);
        instructionScene = new Scene(instructionVbox, 1000, 800);
        getMainWindow().setScene(instructionScene);

    }

    public void ShowExistTeams(ManagementSystem model) {
        function = "showExistTeams";
        vbox7 = new VBox(15);
        showExistTeams.setTextFill(Color.DARKBLUE);
        showExistTeams.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        actionStatus = new Text();
        actionStatus.setText("Teams");
        table7 = new TableView();
        data7 = getTableDataInTeam(model);
        table7.setItems(data7);

        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table7.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);

        TableColumn teamName = new TableColumn("Name");
        teamName.setCellValueFactory(new PropertyValueFactory("teamName"));
        TableColumn sportType = new TableColumn("SportType");
        sportType.setCellValueFactory(new PropertyValueFactory("sportTypes"));


        table7.getColumns().setAll(numberCol, teamName, sportType);
        table7.setPrefWidth(450);
        table7.setPrefHeight(300);
        table7.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        actionStatus.setFill(Color.FIREBRICK);
        previous.setOnAction(event -> getMainWindow().setScene(mainScene));
        vbox7.getChildren().addAll(actionStatus, table7, previous);
        showTeam = new Scene(vbox7, 1000, 800);
        getMainWindow().setScene(showTeam);
    }


    public void showUpdateParticipants(ManagementSystem model) {
        participants = new Label("Participants");
        participants.setTextFill(Color.DARKBLUE);
        participants.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        table2 = new TableView();
        data2 = getTableData(model);
        table2.setItems(data2);

        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table2.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);
        TableColumn titleCol = new TableColumn("Name");
        titleCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn ageCol = new TableColumn("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn genderCol = new TableColumn("Gender");
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn running = new TableColumn("highest Speed[kmh]");
        running.setCellValueFactory(new PropertyValueFactory("highestSpeed"));
        TableColumn jumping = new TableColumn("highest Jump[m]");
        jumping.setCellValueFactory(new PropertyValueFactory("highestJumping"));
        TableColumn numOfMedals = new TableColumn("Medals");
        numOfMedals.setCellValueFactory(new PropertyValueFactory("numOfMedals"));
        TableColumn fromCountry = new TableColumn("Country");
        fromCountry.setCellValueFactory(new PropertyValueFactory("fromCountry"));


        table2.getColumns().setAll(numberCol, titleCol, ageCol, genderCol, running, jumping, numOfMedals, fromCountry);
        table2.setPrefWidth(450);
        table2.setPrefHeight(300);
        table2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        previous.setVisible(true);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));


        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);


        vbox2 = new VBox(20);
        vbox2.setPadding(new Insets(12, 12, 12, 12));

        vbox2.getChildren().addAll(table2, actionStatus, previous);

        secondScene = new Scene(vbox2, 1000, 800); // w x h
        getMainWindow().setScene(secondScene);

    }


    public void addPersonalCompetitions(ManagementSystem model) {
        comboBox3 = new ComboBox();
        comboBox3.getItems().addAll(model.showAllStadiums());
        frame = new VBox(10);
        function = "addPersonalCompetition";
        Label title = new Label("Referees");
        title.setFont(Font.font("Calibri", FontWeight.BOLD, 36));

        add.setVisible(true);
        add.setText("Add");
        frame.setVisible(true);
        table3 = new TableView();
        data3 = getTableRefereeData(model);
        table3.setItems(data3);

        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table3.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);
        TableColumn titleCol = new TableColumn("Name");
        titleCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn ageCol = new TableColumn("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn genderCol = new TableColumn("Gender");
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn experience = new TableColumn("judgementExperience[years]");
        experience.setCellValueFactory(new PropertyValueFactory("judgmentExperience"));
        TableColumn contest = new TableColumn("numOfRunningContests");
        contest.setCellValueFactory(new PropertyValueFactory("numOfRunningContestsRefereed"));
        TableColumn contest2 = new TableColumn("numOfJumpingContest");
        contest2.setCellValueFactory(new PropertyValueFactory("numOfJumpingContestsRefereed"));
        TableColumn country = new TableColumn("Country");
        country.setCellValueFactory(new PropertyValueFactory("fromCountry"));  //?

        table3.getColumns().setAll(numberCol, titleCol, ageCol, genderCol, experience, contest, contest2, country);
        table3.setPrefWidth(450);
        table3.setPrefHeight(300);
        table3.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        previous.setVisible(true);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));


        txtFieldtxt3.setText("Please choose stadium :");
        txtFieldtxt.setText("Please choose the index of referee from the list");
        txtField.setVisible(true);
        txtFieldtxt5.setText("please write type of sport");
        txtFieldtxt6.setText("Please write a day");
        txtField6.setVisible(true);
        txtFieldtxt7.setText("Please write a month");
        txtField7.setVisible(true);
        txtFieldtxt8.setText("Please enter the year");
        txtField8.setVisible(true);
        frame.getChildren().addAll(title, table3, txtFieldtxt3, comboBox3, txtFieldtxt, txtField, txtFieldtxt5, comboBox, txtFieldtxt6, txtField6, txtFieldtxt7, txtField7, txtFieldtxt8, txtField8, add, previous);

        thirdScene = new Scene(frame, 1000, 800);
        getMainWindow().setScene(thirdScene);
        addAthleteToPersonalCompetition.setVisible(true);

    }

    public void addTeamCompetitions(ManagementSystem model) {
        comboBox3 = new ComboBox();
        comboBox3.getItems().addAll(model.showAllStadiums());
        function = "addTeamCompetition";
        Label title = new Label("Referees");
        title.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        add.setVisible(true);
        add.setText("Add");

        vbox5 = new VBox(10);
        table4 = new TableView();
        data4 = getTableRefereeData(model);
        table4.setItems(data4);


        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table4.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);
        TableColumn titleCol = new TableColumn("Name");
        titleCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn ageCol = new TableColumn("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn genderCol = new TableColumn("Gender");
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn experience = new TableColumn("judgementExperience[years]");
        experience.setCellValueFactory(new PropertyValueFactory("judgmentExperience"));
        TableColumn contest = new TableColumn("numOfRunningContests");
        contest.setCellValueFactory(new PropertyValueFactory("numOfRunningContestsRefereed"));
        TableColumn contest2 = new TableColumn("numOfJumpingContest");
        contest2.setCellValueFactory(new PropertyValueFactory("numOfJumpingContestsRefereed"));
        TableColumn country = new TableColumn("Country");
        country.setCellValueFactory(new PropertyValueFactory("fromCountry"));  //?

        table4.getColumns().setAll(numberCol, titleCol, ageCol, genderCol, experience, contest, contest2, country);
        table4.setPrefWidth(450);
        table4.setPrefHeight(300);
        table4.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        previous.setVisible(true);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));

        txtFieldtxt3.setText("Please choose stadium");
        txtFieldtxt4.setText("Please choose the referee from the list");
        txtField4.setVisible(true);
        txtFieldtxt5.setText("please write type of sport");
        txtField5.setVisible(true);
        txtFieldtxt6.setText("Please write a day");
        txtField6.setVisible(true);
        txtFieldtxt7.setText("Please write a month");
        txtField7.setVisible(true);
        txtFieldtxt8.setText("Please enter the year");
        txtField8.setVisible(true);
        vbox5.getChildren().addAll(title, table4, txtFieldtxt3, comboBox3, txtFieldtxt4, txtField4, txtFieldtxt5, comboBox, txtFieldtxt6, txtField6, txtFieldtxt7, txtField7, txtFieldtxt8, txtField8, add, previous);

        fourthScene = new Scene(vbox5, 1000, 800);
        getMainWindow().setScene(fourthScene);

        addTeamToTeamCompetition.setVisible(true);


    }

    public void addNewTeam(ManagementSystem model) {
        comboBox2 = new ComboBox();
        comboBox2.getItems().addAll(model.updateExistCountries());
        function = "addNewTeam";
        add.setVisible(true);
        add.setText("Add");
        previous.setVisible(true);
        frame = new VBox(10);
        frame.setVisible(true);
        txtFieldtxt9.setText("Please enter team name");
        txtField9.setVisible(true);
        txtFieldtxt10.setText("Please enter type of sport");
        frame.setVisible(true);
        textField30.setText("From which country ?");
        txtFieldtxt11.setText("Write the total number of athletes you want in the team ");
        txtField11.setVisible(true);
        txtFieldtxt12.setText("Please enter the indexes of the athletes from the table with ' , '");
        txtField12.setVisible(true);
        table6 = new TableView();
        data6 = getInitialTableData(model);
        table6.setItems(data6);

        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table6.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);
        TableColumn titleCol = new TableColumn("Name");
        titleCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn ageCol = new TableColumn("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn genderCol = new TableColumn("Gender");
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn running = new TableColumn("highest Speed[kmh]");
        running.setCellValueFactory(new PropertyValueFactory("highestSpeed"));
        TableColumn jumping = new TableColumn("highest Jump[m]");
        jumping.setCellValueFactory(new PropertyValueFactory("highestJumping"));
        TableColumn numOfMedals = new TableColumn("Medals");
        numOfMedals.setCellValueFactory(new PropertyValueFactory("numOfMedals"));
        TableColumn fromCountry = new TableColumn("Country");
        fromCountry.setCellValueFactory(new PropertyValueFactory("fromCountry"));


        table6.getColumns().setAll(numberCol, titleCol, ageCol, genderCol, running, jumping, numOfMedals, fromCountry);
        table6.setPrefWidth(450);
        table6.setPrefHeight(300);
        table6.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        frame.getChildren().addAll(table6, txtFieldtxt9, txtField9, txtFieldtxt10, comboBox, textField30, comboBox2, txtFieldtxt11, txtField11, txtFieldtxt12, txtField12, add, previous);
        newTeamScene = new Scene(frame, 1000, 800);
        getMainWindow().setScene(newTeamScene);
        add.setDisable(false);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));
    }

    public void addAthleteToPersonalCompetition(ManagementSystem model) {
        vbox4 = new VBox(10);
        function = "addAthleteToPersonalCompetition";
        add.setVisible(true);
        add.setText("Add");
        Label label = new Label(model.displayPersonalCompetitions());
        label.setVisible(true);
        label.setLayoutX(20);
        label.setLayoutY(20);
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setStyle("-fx-background-color: #50a08d;-fx-border-color: #a0a0a0;-fx-border-width: 3 3 3 3");
        label.setTextFill(Color.WHITE);
        sp.setVisible(true);
        sp.setContent(label);
        label.setMaxWidth(1000);
        label.setWrapText(true);
        label.wrapTextProperty();
        label.setAlignment(Pos.TOP_CENTER);
        vbox4.setVisible(true);
        vbox4.setVisible(true);
        previous.setVisible(true);
        txtFieldtxt13.setText("Please choose the number of competition (in the top of the screen) that you want to add athletes ");
        txtField13.setVisible(true);
        txtFieldtxt14.setText("Write the total number of athletes you want in the competition ");
        txtField14.setVisible(true);
        txtFieldtxt15.setText("Please enter the indexes of the athletes from the table with ' , '");
        txtField15.setVisible(true);
        participants = new Label("All participants in the database");
        participants.setTextFill(Color.DARKBLUE);
        participants.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        table8 = new TableView();
        data8 = getInitialTableData(model);
        table8.setItems(data8);

        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table8.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);
        TableColumn titleCol = new TableColumn("Name");
        titleCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn ageCol = new TableColumn("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        TableColumn genderCol = new TableColumn("Gender");
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        TableColumn running = new TableColumn("highest Speed[kmh]");
        running.setCellValueFactory(new PropertyValueFactory("highestSpeed"));
        TableColumn jumping = new TableColumn("highest Jump[m]");
        jumping.setCellValueFactory(new PropertyValueFactory("highestJumping"));
        TableColumn numOfMedals = new TableColumn("Medals");
        numOfMedals.setCellValueFactory(new PropertyValueFactory("numOfMedals"));
        TableColumn fromCountry = new TableColumn("Country");
        fromCountry.setCellValueFactory(new PropertyValueFactory("fromCountry"));

        table8.setMinHeight(300);
        vbox4.setVgrow(table8, Priority.NEVER);

        table8.getColumns().setAll(numberCol, titleCol, ageCol, genderCol, running, jumping, numOfMedals, fromCountry);

        table8.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox4.setPadding(new Insets(12, 12, 12, 12));


        vbox4.getChildren().addAll(sp, table8, txtFieldtxt13, txtField13, txtFieldtxt14, txtField14, txtFieldtxt15, txtField15, add, previous);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));
        addAthleteToPCScene = new Scene(vbox4, 1000, 800);
        getMainWindow().setScene(addAthleteToPCScene);
    }

    public void AddTeamToTeamCompetition(ManagementSystem model) {
        vbox6 = new VBox(10);
        function = "addTeamToTeamCompetition";
        add.setVisible(true);
        add.setText("Add");
        Label label = new Label(model.displayTeamCompetitions());
        label.setVisible(true);
        label.setLayoutX(20);
        label.setLayoutY(20);
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        label.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setStyle("-fx-background-color: #50a08d;-fx-border-color: #a0a0a0;-fx-border-width: 3 3 3 3");
        label.setTextFill(Color.WHITE);
        sp2.setVisible(true);
        sp2.setFitToWidth(true);
        sp2.setContent(label);
        label.setMaxWidth(1000);
        label.setWrapText(true);
        label.wrapTextProperty();
        previous.setVisible(true);
        txtFieldtxt16.setText("Please choose the index of competition that you want to add a team ");
        txtField16.setVisible(true);
        txtFieldtxt17.setText("Write the total number of teams you want in the competition");
        txtField17.setVisible(true);
        txtFieldtxt18.setText("Please enter the indexes of the teams from the table with ' , '");
        txtField18.setVisible(true);
        teamParticipants = new Label("Team Participants");
        teamParticipants.setTextFill(Color.BLACK);
        teamParticipants.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        table5 = new TableView();
        data5 = getTableDataInTeam(model);
        table5.setItems(data5);

        TableColumn numberCol = new TableColumn("Index");
        numberCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Athlete, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Athlete, String> p) {
                return new ReadOnlyObjectWrapper(table5.getItems().indexOf(p.getValue()) + 1);
            }
        });
        numberCol.setSortable(false);
        TableColumn teamName = new TableColumn("Name");
        teamName.setCellValueFactory(new PropertyValueFactory("teamName"));
        TableColumn sportType = new TableColumn("SportType");
        sportType.setCellValueFactory(new PropertyValueFactory("sportTypes"));

        table5.setMinHeight(300);
        vbox6.setVgrow(table5, Priority.NEVER);

        table5.getColumns().setAll(numberCol, teamName, sportType);
        table5.setPrefWidth(450);
        table5.setPrefHeight(300);
        table5.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);
        vbox6.getChildren().addAll(sp2, table5, actionStatus, txtFieldtxt16, txtField16, txtFieldtxt17, txtField17, txtFieldtxt18, txtField18, add, previous);
        table5.setVisible(true);

        previous.setOnAction(e -> getMainWindow().setScene(mainScene));
        addTeamToTC = new Scene(vbox6, 1000, 800);
        getMainWindow().setScene(addTeamToTC);
    }

    public void startCompetition(ManagementSystem model) {
        start.setVisible(true);
        function = "GetWinners";
        Label label = new Label(model.getInfoCompetitions());
        sp3.setVisible(true);
        sp3.setContent(label);
        label.setLayoutX(50);
        label.setLayoutY(50);
        label.setMaxWidth(1000);
        label.setWrapText(true);
        label.wrapTextProperty();
        label.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setStyle("-fx-background-color: #50a08d;-fx-border-color: #a0a0a0;-fx-border-width: 3 3 3 3");
        label.setTextFill(Color.WHITE);
        label.setVisible(true);
        vbox3 = new VBox(10);
        txtFieldtxt19.setText("please choose the number of the competition (in the top of the screen) you want to start the competition");
        txtField19.setVisible(true);
        previous.setVisible(true);
        previous.setOnAction(event -> getMainWindow().setScene(mainScene));
        vbox3.getChildren().addAll(sp3, txtFieldtxt19, txtField19, start, previous);
        competitionScene = new Scene(vbox3, 1000, 800);
        getMainWindow().setScene(competitionScene);

    }

    public void getFinalWinners(ManagementSystem model) throws Exception {
        function = "Final Winners";
        gp2 = new GridPane();
        gp2.setHgap(6);
        gp2.setVgap(6);
        if (count == 0) {
            try {
                model.updateCountries();
            } catch (Exception c) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(c.getMessage());
                alert.show();
            }
        }
        firstWinner = new Label();
        firstWinner.setText(model.getOlympics().getCountries().get(0).getCountryName() + "\nNum of medals: " + model.getOlympics().getCountries().get(0).getNumOfMedals());
        firstWinner.setTextFill(Color.BLACK);
        firstWinner.setFont(new Font(20));
        secondWinner = new Label();
        secondWinner.setText(model.getOlympics().getCountries().get(1).getCountryName() + "\nNum of medals: " + model.getOlympics().getCountries().get(1).getNumOfMedals());
        secondWinner.setTextFill(Color.BLACK);
        secondWinner.setFont(new Font(20));
        thirdWinner = new Label();
        thirdWinner.setText(model.getOlympics().getCountries().get(2).getCountryName() + "\nNum of medals: " + model.getOlympics().getCountries().get(2).getNumOfMedals());
        thirdWinner.setTextFill(Color.BLACK);
        thirdWinner.setFont(new Font(20));

        finishButton = new Button("Finish");
        finishButton.setOnAction(e -> {
            e.consume();
            try {
                CloseProgram();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        gp2.add(firstWinner, 35, 33);
        gp2.add(secondWinner, 10, 36);
        gp2.add(thirdWinner, 48, 36);
        gp2.add(finishButton, 2, 90);
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

        finalScene = new Scene(gp2, 950, 760);
        count++;
        getMainWindow().setScene(finalScene);

    }

    public void getWinnersInTeamCompetition(TeamCompetition competition) {
        parameterBox = new GridPane();
        parameterBox.setHgap(6);
        parameterBox.setVgap(6);
        firstTeamWinner = new Label();
        firstTeamWinner.setText(((TeamCompetition) competition).getTeamsWinners().get(0).getTeamName() + "     \n" + ((TeamCompetition) competition).getTeamsWinners().get(0).getFromCountry());
        firstTeamWinner.setTextFill(Color.BLACK);
        firstTeamWinner.setFont(new Font(20));
        secondTeamWinner = new Label();
        secondTeamWinner.setText(((TeamCompetition) competition).getTeamsWinners().get(1).getTeamName() + "    \n" + ((TeamCompetition) competition).getTeamsWinners().get(1).getFromCountry());
        secondTeamWinner.setTextFill(Color.BLACK);
        secondTeamWinner.setFont(new Font(20));
        thirdTeamWinner = new Label();
        thirdTeamWinner.setText(((TeamCompetition) competition).getTeamsWinners().get(2).getTeamName() + "   \n" + ((TeamCompetition) competition).getTeamsWinners().get(2).getFromCountry());
        thirdTeamWinner.setTextFill(Color.BLACK);
        thirdTeamWinner.setFont(new Font(20));
        previous.setVisible(true);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));


        parameterBox.add(firstTeamWinner, 33, 35);
        parameterBox.add(secondTeamWinner, 15, 40);
        parameterBox.add(thirdTeamWinner, 70, 40);
        parameterBox.add(previous, 2, 90);
        parameterBox.setBackground(
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

        teamWinners = new Scene(parameterBox, 950, 760); // w x h
        getMainWindow().setScene(teamWinners);

    }

    public void getWinnersInPersonalCompetition(PersonalCompetition competition) {
        gp4 = new GridPane();
        gp4.setHgap(6);
        gp4.setVgap(6);
        firstAthleteWinner = new Label();
        firstAthleteWinner.setText(((PersonalCompetition) competition).getWinners().get(0).getName() + "\n" + (((PersonalCompetition) competition).getWinners().get(0).getFromCountry()));
        firstAthleteWinner.setTextFill(Color.BLACK);
        firstAthleteWinner.setFont(new Font(20));
        secondAthleteWinner = new Label();
        secondAthleteWinner.setText(((PersonalCompetition) competition).getWinners().get(1).getName() + "\n" + (((PersonalCompetition) competition).getWinners().get(1).getFromCountry()));
        secondAthleteWinner.setTextFill(Color.BLACK);
        secondAthleteWinner.setFont(new Font(20));
        thirdAthleteWinner = new Label();
        thirdAthleteWinner.setText(((PersonalCompetition) competition).getWinners().get(2).getName() + "\n" + (((PersonalCompetition) competition).getWinners().get(2).getFromCountry()));
        thirdAthleteWinner.setTextFill(Color.BLACK);
        thirdAthleteWinner.setFont(new Font(20));
        previous.setVisible(true);
        previous.setOnAction(e -> getMainWindow().setScene(mainScene));


        gp4.add(firstAthleteWinner, 32, 35);
        gp4.add(secondAthleteWinner, 7, 40);
        gp4.add(thirdAthleteWinner, 58, 40);
        gp4.add(previous, 2, 90);
        gp4.setBackground(
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
        athleteWinners = new Scene(gp4, 950, 760); // w x h
        getMainWindow().setScene(athleteWinners);

    }

    public void CloseProgram() throws Exception {

        int answer = JOptionPane.showConfirmDialog(null, "Exit", "Exit? ", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_OPTION) {

            System.out.print("Closing");
            MainWindow.close();

        }
    }


    public ObservableList getTableRefereeData(ManagementSystem model) {
        List list = new ArrayList();

        list.addAll(model.showReferees());
        ObservableList data = FXCollections.observableList(list);
        return data;
    }


    public ObservableList getInitialTableData(ManagementSystem model) {
        List list = new ArrayList();

        list.addAll(model.showAllAthletesInFile());
        ObservableList data = FXCollections.observableList(list);
        return data;
    }


    public ObservableList getTableData(ManagementSystem model) {
        List list = new ArrayList();

        list.addAll(model.showUpdateAthlete());
        ObservableList data = FXCollections.observableList(list);
        return data;
    }

    public ObservableList getTableDataInTeam(ManagementSystem model) {
        List list = new ArrayList();

        list.addAll(model.showUpdateTeams());
        ObservableList data = FXCollections.observableList(list);
        return data;
    }


    public void getWinnersInCompetition(Competition competition) {
        if (competition instanceof PersonalCompetition) {
            if (((PersonalCompetition) competition).getPersonalCompetitionAthletes().size() >= 3) {
                getWinnersInPersonalCompetition((PersonalCompetition) competition);
            }
        } else if (((TeamCompetition) competition).getCompetitionTeams().size() >= 3) {
            getWinnersInTeamCompetition((TeamCompetition) competition);
        }
    }

    public void updateModel(ManagementSystem model) throws Exception {
        if (function == "building the olympic!") {
            if (textField23.getText().isEmpty() || textField24.getText().isEmpty() || textField25.getText().isEmpty()) {
                Alert art = new Alert(Alert.AlertType.ERROR);
                art.setContentText("Please fill all the details");
                art.show();
            }
            try {
                String olympicName = textField23.getText();
                String input = textField24.getText();
                startDate = input.split("/");
                int day = Integer.parseInt(startDate[0]);
                int month = Integer.parseInt(startDate[1]);
                int year = Integer.parseInt(startDate[2]);
                date = new Date(day, month, year);
                String endInput = textField25.getText();
                endDate = endInput.split("/");
                int endDay = Integer.parseInt(endDate[0]);
                int endMonth = Integer.parseInt(endDate[1]);
                int endYear = Integer.parseInt(endDate[2]);
                endDate1 = new Date(endDay, endMonth, endYear);
                model.updateOlympicName(olympicName);
                model.updateStartDate(date);
                model.updateEndDate(endDate1);
                getMainWindow().setTitle(olympicName);
                openingLabel.setText("Start date: " + date + "\nEnd date: " + endDate1);
                getMainWindow().setScene(mainScene);
            } catch (Exception exception) {
                Alert art = new Alert(Alert.AlertType.ERROR);
                art.setContentText(exception.getMessage());
                art.show();
            }

        }
        if (function == "addPersonalCompetition") {
            if (txtField6.getText().isEmpty() || txtField7.getText().isEmpty() || txtField8.getText().isEmpty()) {
                Alert art = new Alert(Alert.AlertType.ERROR);
                art.setContentText("Please fill all the details");
                art.show();
            } else {
                try {
                    int index = Integer.parseInt(txtField.getText());
                    int day = Integer.parseInt(txtField6.getText());
                    int month = Integer.parseInt(txtField7.getText());
                    int year = Integer.parseInt(txtField8.getText());
                    Date date = new Date(day, month, year);
                    model.checkDates(date, model.getOlympics().getEndDate());
                    model.checkDates(model.getOlympics().getStartDate(), date);
                    model.buildPersonalCompetition((Stadium) comboBox3.getValue(), index, (Team.eSportTypes) comboBox.getValue(), date);
                    numofPersonalCompetition++;
                    Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
                    msg.setContentText("added successfully!");
                    msg.show();
                } catch (Exception c) {
                    Alert art = new Alert(Alert.AlertType.ERROR);
                    art.setContentText(c.getMessage());
                    art.show();
                }
            }
        } else if (function == "addTeamCompetition") {
            if (txtField4.getText().isEmpty() || txtFieldtxt6.getText().isEmpty() || txtField7.getText().isEmpty() || txtField8.getText().isEmpty()) {
                Alert art = new Alert(Alert.AlertType.ERROR);
                art.setContentText("Please fill all the details");
                art.show();
            } else {
                try {
                    int index = Integer.parseInt(txtField4.getText());
                    int day = Integer.parseInt(txtField6.getText());
                    int month = Integer.parseInt(txtField7.getText());
                    int year = Integer.parseInt(txtField8.getText());
                    Date date = new Date(day, month, year);
                    model.checkDates(date, model.getOlympics().getEndDate());
                    model.checkDates(model.getOlympics().getStartDate(), date);
                    model.buildTeamCompetition((Stadium) comboBox3.getValue(), index, (Team.eSportTypes) comboBox.getValue(), date);
                    numOfTeamsCompetiton++;
                    Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
                    msg.setContentText(" added successfully!");
                    msg.show();
                } catch (Exception c) {
                    Alert art = new Alert(Alert.AlertType.ERROR);
                    art.setContentText(c.getMessage());
                    art.show();
                }
            }
        } else if (function == "addNewTeam") {
            String teamName = txtField9.getText();
            int numberOfParticipantsInTeam;
            if (txtField9.getText().isEmpty() || txtField11.getText().isEmpty() || txtField12.getText().isEmpty()) {
                Alert msg = new Alert(Alert.AlertType.ERROR);
                msg.setContentText("Please fill all the texts ");
                msg.show();
            } else {
                numberOfParticipantsInTeam = Integer.parseInt(txtField11.getText());
                String input = txtField12.getText();
                athletes = input.split(",");
                if (athletes.length != numberOfParticipantsInTeam) {
                    Alert msg = new Alert(Alert.AlertType.ERROR);
                    msg.setContentText("You must enter " + numberOfParticipantsInTeam + " numbers");
                    msg.show();
                } else {
                    try {
                        model.addNewTeam(teamName, (Team.eSportTypes) comboBox.getValue(), athletes, (Country) comboBox2.getValue());
                        Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
                        msg.setContentText("created successfully!");
                        msg.show();
                    } catch (Exception c) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText(c.getMessage());
                        alert.show();
                    }
                }
            }
        } else if (function == "addAthleteToPersonalCompetition") {
            if (txtField13.getText().isEmpty() || txtField14.getText().isEmpty() || txtField15.getText().isEmpty()) {
                Alert art = new Alert(Alert.AlertType.ERROR);
                art.setContentText("Please fill all the details");
                art.show();
            }
            int indexCompetition = Integer.parseInt(txtField13.getText());
            int numOfAthletes = Integer.parseInt(txtField14.getText());
            minAthletes += numOfAthletes;
            String input = txtField15.getText();
            athletes = input.split(",");
            if (athletes.length != numOfAthletes) {
                Alert msg = new Alert(Alert.AlertType.ERROR);
                msg.setContentText("You must enter " + numOfAthletes + " numbers");
                msg.show();
            } else {
                try {
                    model.addAthleteToPersonalCompetition(athletes, indexCompetition);

                    Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
                    if ((minAthletes >= 3)) {
                        startCompetition.setVisible(true);
                    }
                    msg.setContentText("created successfully!");
                    msg.show();
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                    alert.show();
                }
            }
        } else if (function == "addTeamToTeamCompetition") {
            if (txtField16.getText().isEmpty() || txtField17.getText().isEmpty() || txtField18.getText().isEmpty()) {
                Alert art = new Alert(Alert.AlertType.ERROR);
                art.setContentText("Please fill all the details");
                art.show();
            }
            int indexCompetition = Integer.parseInt(txtField16.getText());
            int numOfTeams = Integer.parseInt(txtField17.getText());
            minTeams += numOfTeams;
            String input = txtField18.getText();
            teams = input.split(",");
            if (teams.length != numOfTeams) {
                Alert msg = new Alert(Alert.AlertType.ERROR);
                msg.setContentText("You must enter " + numOfTeams + " numbers");
                msg.show();
            } else {
                try {
                    model.addTeamToTeamCompetition(indexCompetition, teams);
                    if ((minTeams >= 3)) {
                        startCompetition.setVisible(true);
                    }
                    Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
                    msg.setContentText("created successfully!");
                    msg.show();
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                    alert.show();
                }
            }
        } else if (function == "GetWinners") {
            try {
                int index = Integer.parseInt(txtField19.getText());
                if (txtField19.getText().isEmpty()) {
                    Alert art = new Alert(Alert.AlertType.ERROR);
                    art.setContentText("Please fill all the details");
                    art.show();
                }
                model.getWinnersInCompetition(model.getOlympics().getCompetitions().get(index - 1));
                getWinnersInCompetition(model.getOlympics().getCompetitions().get(index - 1));
                Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
                msg.setContentText("The winners are: ");
                msg.show();
            } catch (Exception c) {
                Alert msg = new Alert(Alert.AlertType.ERROR);
                msg.setContentText(c.getMessage());
                msg.show();
            }
        }
    }


    public void addEventToShowAllParticipants(EventHandler<ActionEvent> showParticipants) {
        showAthletes.setOnAction(showParticipants);
    }

    public void addEventToAddPersonalCompetition(EventHandler<ActionEvent> addNewBuildPersonalCompetition) {
        buildPersonalCompetition.setOnAction(addNewBuildPersonalCompetition);
    }

    public void addEventToAddTeamCompetition(EventHandler<ActionEvent> addNewBuildTeamCompetition) {
        buildTeamCompetition.setOnAction(addNewBuildTeamCompetition);
    }

    public void addEventToAddNewTeam(EventHandler<ActionEvent> NewTeam) {
        addNewTeam.setOnAction(NewTeam);
    }

    public void addEventToAddTeamInTeamCompetition(EventHandler<ActionEvent> AddTeamInTeamCompetition) {
        addTeamToTeamCompetition.setOnAction(AddTeamInTeamCompetition);
    }

    public void addEventToRun(EventHandler<ActionEvent> runEvent) {
        run.setOnAction(runEvent);
    }

    public void addEventToAddAthletePersonalCompetition(EventHandler<ActionEvent> AddAthletePersonalCompetition) {
        addAthleteToPersonalCompetition.setOnAction(AddAthletePersonalCompetition);
    }

    public void addEventToAddStartCompetition(EventHandler<ActionEvent> StartCompetition) {
        startCompetition.setOnAction(StartCompetition);
    }

    public void addEventToGetFinalWinners(EventHandler<ActionEvent> getFinalWinners) {
        finalWinners.setOnAction(getFinalWinners);
    }

    public void addEventToAddButton(EventHandler<ActionEvent> addButtonPressed) {
        add.setOnAction(addButtonPressed);
    }

    public void addEventToStartButton(EventHandler<ActionEvent> startButtonPressed) {
        start.setOnAction(startButtonPressed);
    }

    public void addEventToShowExistTeams(EventHandler<ActionEvent> ShowExistTeams) {
        showExistTeams.setOnAction(ShowExistTeams);
    }

    public Stage getMainWindow() {
        return MainWindow;
    }


    public void clearView() {
        comboBox.setValue("");
        label.setText("");

        txtField5.setText("");

        txtField6.setText("");

        txtField7.setText("");

        txtField8.setText("");

        txtField9.setText("");
        txtField10.setText("");
        txtField11.setText("");
        txtField12.setText("");
        txtField13.setText("");
        txtField14.setText("");
        txtField15.setText("");
        txtField16.setText("");
        txtField17.setText("");
        txtField18.setText("");
        txtField19.setText("");
        txtField20.setText("");
        txtField21.setText("");
        txtField22.setText("");
        txtField23.setText("");

    }
}