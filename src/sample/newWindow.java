package sample;
import Model.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.List;


public class newWindow extends Main{

    private static Stage newStage;
    private static Scene scene;

//    public static void Display_new_window(String title, Competition competitionInfo) {
//        getWinners(competitionInfo);
//        newStage = new Stage();
//        newStage.setTitle(title);
//        newStage.initModality(Modality.APPLICATION_MODAL); // block window
//        newStage.setMinWidth(400);
//        newStage.setMinHeight(400);
//        Label l = new Label();
//
//        Button button1 = new Button("Start competition");
//        Button button3 = new Button("Get winners");
//        Button button2 = new Button("Previous");
//        l.setText(competitionInfo.toString());
//        VBox layout = new VBox(30);
//        layout.getChildren().addAll(button1,l,button2,button3);
//        layout.setAlignment(Pos.TOP_CENTER);
//        button3.setVisible(true);
//        button1.setOnAction(e -> l.getText());
//        newStage.setOnCloseRequest(e -> closeWindow());
//        scene = new Scene(layout,500,500);
//        button2.setOnAction(event -> newStage.setScene(scene));
//        button3.setOnAction(e ->deleteTexts(l,competitionInfo));
//      //  newStage.setScene(changeScene());
//
//
//        newStage.show();
//
//    }
//
//
//
//    public static List<Athlete> getWinners(Competition competition) {
//        if (competition instanceof TeamCompetition)
//            getWinnersTeam(competition);
//        else
//            return ((PersonalCompetition) competition).getWinners();
//        return null;
//    }
//    private static List<Team> getWinnersTeam(Competition competition) {
//        return ((TeamCompetition)competition).getWinnersiTeams();
//
//    }
//    public static void deleteTexts(Label label,Competition competition){
//        label.setText("");
//        label.setText(getWinners(competition).toString());
//    }
//
//
//    public static void closeWindow() {
//
//        System.out.println("Closed!");
//        //  newStage.close();
//
//    }


}