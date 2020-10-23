import Controller.Controller;
import Model.Date;
import Model.Olympics;
import View.OlympicView;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

public class OlympicMain extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Olympics spain2020 = new Olympics("Spain", new Date(1, 12, 2020), new Date(16, 12, 2020));
        File alldata = new File("data.txt");
        Scanner sFile2 = new Scanner(alldata);
        spain2020.informationDataFromFile(sFile2);
        OlympicView olympicView = new OlympicView(primaryStage,spain2020);
        Controller theController = new Controller(spain2020, olympicView);
    }
}

