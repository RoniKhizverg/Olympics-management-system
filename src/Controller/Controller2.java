package Controller;

import Model.*;
import View.View2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;


public class Controller2 {
    private ManagementSystem model;
    private View2 View2;


    public Controller2(View2 View2, ManagementSystem model) {
        EventHandler<ActionEvent> start = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    model.updateCompetitionAuto();
                    View2.showAllCompetitons();
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        View2.addEventToEnterTheOlympic(start);


        EventHandler<ActionEvent> enterToCompetition1 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    View2.getDetailsInCompetition(model.getFileOlympic().getCompetitions().get(0));
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        View2.addEventToEnterToCompetitionNum1(enterToCompetition1);


        EventHandler<ActionEvent> enterCompetition2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    View2.getDetailsInCompetition(model.getFileOlympic().getCompetitions().get(1));
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        View2.addEventToEnterToCompetitionNum2(enterCompetition2);

        EventHandler<ActionEvent> enterCompetition3 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    View2.getDetailsInCompetition(model.getFileOlympic().getCompetitions().get(2));
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        View2.addEventToEnterToCompetitionNum3(enterCompetition3);

        EventHandler<ActionEvent> enterCompetition4 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    View2.getDetailsInCompetition(model.getFileOlympic().getCompetitions().get(3));
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        View2.addEventToEnterToCompetitionNum4(enterCompetition4);


        EventHandler<ActionEvent> getFinalWinners = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    View2.getWinners(model);
                } catch (Exception c) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(c.getMessage());
                }
            }
        };
        View2.addEventToGetFinalWinner(getFinalWinners);

    }
}