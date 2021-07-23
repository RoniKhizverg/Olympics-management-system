import Controller.Controller;
import Controller.Controller2;
import Model.Date;
import Model.ManagementSystem;
import View.View2;
import View.View1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;

public class OlympicMain extends Application {
    private Button button;
    private Button button2;
    private Label wellcomLabel;
    private View2 View2;
    private VBox vBox;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        vBox = new VBox(200);
        scene = new Scene(vBox, 1000, 800);
        vBox.setBackground(new Background(
                Collections.singletonList(new BackgroundFill(
                        Color.WHITE,
                        new CornerRadii(500),
                        new Insets(10))),
                Collections.singletonList(new BackgroundImage(
                        new Image(getClass().getResourceAsStream("backGroundImage.png"), 1000, 800, false, true),
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT))));

        File alldata = new File("data.txt");
        Scanner sFile2 = new Scanner(alldata);
        wellcomLabel = new Label(" Welcome to olympic games!");
        wellcomLabel.setLayoutX(50);
        wellcomLabel.setLayoutY(50);
        wellcomLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        button = new Button("Start Automatically the olympic");
        button.setTextFill(Color.DARKBLUE);
        button.setFont(Font.font("Calibri", FontWeight.BOLD, 25));

        button2 = new Button("Build the olympic manually");
        button2.setTextFill(Color.DARKBLUE);
        button2.setFont(Font.font("Calibri", FontWeight.BOLD, 25));
        vBox.getChildren().addAll(wellcomLabel, button, button2);
        vBox.setAlignment(Pos.CENTER);
        primaryStage.setScene(scene);
        button.setOnAction(event -> {
            try {
                ManagementSystem spain2020 = new ManagementSystem("Spain", new Date(1, 12, 2020), new Date(16, 12, 2020));
                View2 = new View2(primaryStage, spain2020);
                Controller2 theController = new Controller2(View2, spain2020);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        button2.setOnAction(event -> {
            try {
                ManagementSystem managementSystem = new ManagementSystem();
                View1 view1 = new View1(primaryStage);
                view1.introduction();
                Controller theController = new Controller(managementSystem, view1);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        primaryStage.show();
    }
}

