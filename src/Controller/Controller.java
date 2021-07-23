package Controller;

import Model.*;
import View.View1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;


public class Controller {
    private Olympics spain2020;
    private View1 olympicView;


    public Controller(ManagementSystem spain2020, View1 olympicView) {
        EventHandler<ActionEvent> showAllParticipants = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.showUpdateParticipants(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToShowAllParticipants(showAllParticipants);


        EventHandler<ActionEvent> addPersonalCompetition = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.addPersonalCompetitions(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToAddPersonalCompetition(addPersonalCompetition);
        EventHandler<ActionEvent> addTeamCompetition = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.addTeamCompetitions(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToAddTeamCompetition(addTeamCompetition);

        EventHandler<ActionEvent> addNewTeam = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.addNewTeam(spain2020);
                  //  olympicView.clearView();
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToAddNewTeam(addNewTeam);
        EventHandler<ActionEvent> addTeamToTeamCompetition = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.AddTeamToTeamCompetition(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToAddTeamInTeamCompetition(addTeamToTeamCompetition);


        EventHandler<ActionEvent> AddAthletePersonalCompetition = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.addAthleteToPersonalCompetition(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToAddAthletePersonalCompetition(AddAthletePersonalCompetition);
        EventHandler<ActionEvent> StartCompetition = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.startCompetition(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };

        olympicView.addEventToAddStartCompetition(StartCompetition);

        EventHandler<ActionEvent> GetFinalWinners = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.getFinalWinners(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToGetFinalWinners(GetFinalWinners);

        EventHandler<ActionEvent> operateRun = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.updateModel(spain2020);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        olympicView.addEventToRun(operateRun);

        EventHandler<ActionEvent> addButtonPressed = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.updateModel(spain2020);
                    olympicView.clearView();
                } catch (Exception e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(e.getMessage());
                }
            }
        };
        olympicView.addEventToAddButton(addButtonPressed);

        EventHandler<ActionEvent> startButtonPressed = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.updateModel(spain2020);
                  //  olympicView.clearView();
                } catch (Exception e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(e.getMessage());
                }
            }
        };
        olympicView.addEventToStartButton(startButtonPressed);

        EventHandler<ActionEvent> showExistTeams = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    olympicView.ShowExistTeams(spain2020);
                    //  olympicView.clearView();
                } catch (Exception e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(e.getMessage());
                }
            }
        };
        olympicView.addEventToShowExistTeams(showExistTeams);

    }
}