package sample;

import Model.Competition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    Button button1, button2, button3, button4, button5, button6, button7,button8,button9,button10,button11,button12,button13,button14;
    Scene s1, s2,s3,s4,s5,s6;
    Stage MainWindow;
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

        button7.setFont(new Font("David", 10));
        button7.setAlignment(Pos.BOTTOM_RIGHT);

        VBox layout2 = new VBox(20);
        layout2.setAlignment(Pos.CENTER);
        button2.setOnAction(e ->
                Display_new_window(controller.getCompetitions().get(0),primaryStage));
        button3.setOnAction(e ->  Display_new_window(controller.getCompetitions().get(1),primaryStage));
        button4.setOnAction(e ->   Display_new_window(controller.getCompetitions().get(2),primaryStage));
        button5.setOnAction(e ->   Display_new_window(controller.getCompetitions().get(3),primaryStage));
        button7.setOnAction(e ->  primaryStage.setScene(s2));
        button6.setOnAction(e -> getWinners(primaryStage));

        button1.setOnAction(e -> primaryStage.setScene(s2));

        layout2.getChildren().addAll(button2, button3, button4, button5, button6, stadiumView1, stadiumView2, stadiumView3, stadiumView4);

        s2 = new Scene(layout2, 700, 600);




        primaryStage.show();
    }

    private void getWinners(Stage primaryStage) {
        Image imageView5 = new Image(getClass().getResourceAsStream("podium.png"));
        ImageView stadiumView5 = new ImageView(imageView5);
        stadiumView5.setImage(imageView5);
        button13 = new Button("previous");
        button14 = new Button("Finish");
        button13.setAlignment(Pos.BOTTOM_LEFT);
        button14.setAlignment(Pos.BOTTOM_RIGHT);
        button13.setOnAction(e -> primaryStage.setScene(s2) );
        button14.setOnAction(e -> primaryStage.close());
        Label l3 = new Label();
        l3.setText(controller.getFinalWinners());
        VBox vBox = new VBox(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(stadiumView5,l3,button13,button14);
        s6 = new Scene(vBox,700,600);
        primaryStage.setScene(s6);

    }

    public void Display_new_window( Competition competition,Stage primaryStage) {
        Label l2 = new Label("");
        button8 = new Button("Show participants ");
         button9 = new Button("Start Competition");
         button10 = new Button("previous");
         button11 = new Button("previous");
        button12 = new Button("previous");
        Label l = new Label();
        l2.setText(competition.toString());
        l.setText(controller.spain2020.getWinnersInSpecificCompetition(competition));
        button10.setOnAction(e -> primaryStage.setScene(s2));
        button9.setOnAction(e ->  primaryStage.setScene(s4));
        button8.setOnAction(e ->primaryStage.setScene(s5));
        button11.setOnAction(e -> primaryStage.setScene(s3));
        button12.setOnAction(e -> primaryStage.setScene(s3));
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().addAll(button8,button9,button10);
        s3 =new Scene(vbox,600,700);
        VBox vBox2 = new VBox(20);
        vBox2.getChildren().addAll(l,button11);
        s4 = new Scene(vBox2,600,700);
        VBox vBox3 = new VBox(20);
        vBox3.getChildren().addAll(l2,button12);
        s5 = new Scene(vBox3,600,700);
        primaryStage.setScene(s3);
        primaryStage.show();

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
