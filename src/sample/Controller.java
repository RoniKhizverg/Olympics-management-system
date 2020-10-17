package sample;

import Model.*;
import Model.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Controller {
    public Olympics spain2020 = new Olympics("Spain", new Date(1, 12, 2020), new Date(16, 12, 2020));

    @FXML
    public void getInfroInOlympics() throws Exception {

        File alldata = new File("data.txt");
        Scanner sFile2 = new Scanner(alldata);
        spain2020.informationDataFromFile(sFile2);

        List<Competition> competitions = new ArrayList<Competition>();
        int randomReferee;
        boolean isFound = false;
        Stadium CampNou = new Stadium("Camp Nou", "Barcelona", 99354);
        Stadium EstadioSantiagoBernabeu = new Stadium("Estadio Santiago Bernabeu", "Madrid", 85454);
        Stadium EstadioMetropolitano = new Stadium("Estadio Metropolitano", "Madrid", 68456);
        Stadium EstadioBenitoVillamarin = new Stadium("Estadio Benito Villamarin", "Madrid", 60724);


        do {
            randomReferee = (int) (Math.random() * spain2020.getAllReferees().size()); // a random way
            if (spain2020.getAllReferees().get(randomReferee) instanceof JumpingReferee) {
                competitions.add(new TeamCompetition(spain2020.getAllReferees().get(randomReferee), Team.eSportTypes.JUMPING,
                        new Date(2, 12, 2020), CampNou));
                isFound = true;
            }
        } while (!isFound);
        do {
            isFound = false;
            randomReferee = (int) (Math.random() * spain2020.getAllReferees().size()); // a random way
            if (spain2020.getAllReferees().get(randomReferee) instanceof RunnerReferee) {
                competitions.add(new TeamCompetition(spain2020.getAllReferees().get(randomReferee), Team.eSportTypes.RUNNING,
                        new Date(2, 12, 2020), EstadioSantiagoBernabeu));
                isFound = true;
            }
        } while (!isFound);
        do {
            isFound = false;
            randomReferee = (int) (Math.random() * spain2020.getAllReferees().size()); // a random way
            if (spain2020.getAllReferees().get(randomReferee) instanceof RunnerReferee) {
                competitions.add(new PersonalCompetition(spain2020.getAllReferees().get(randomReferee),
                        Team.eSportTypes.RUNNING, new Date(3, 12, 2020), EstadioMetropolitano));
                isFound = true;
            }
        } while (!isFound);
        do {
            isFound = false;
            randomReferee = (int) (Math.random() * spain2020.getAllReferees().size()); // a random way
            if (spain2020.getAllReferees().get(randomReferee) instanceof JumpingReferee) {
                competitions.add(new PersonalCompetition(spain2020.getAllReferees().get(randomReferee),
                        Team.eSportTypes.JUMPING, new Date(4, 12, 2020), EstadioBenitoVillamarin));
                isFound = true;
            }
        } while (!isFound);
        for (int i = 0; i < competitions.size(); i++) {
            spain2020.addCompetitons(competitions.get(i));
        }


        for (int a = 0; a < spain2020.getCompetitions().size(); a++) {
            if (spain2020.getCompetitions().get(a) instanceof TeamCompetition) {
                for (int j = 0; j < spain2020.getAllTeams().size(); j++) {
                    if (spain2020.getAllTeams().get(j).getSportTypes() == spain2020.getCompetitions().get(a).getSportTypes()) {
                        ((TeamCompetition) spain2020.getCompetitions().get(a))
                                .addTeamsToCompetition(spain2020.getAllTeams().get(j));
                    }
                }
            } else if (spain2020.getCompetitions().get(a) instanceof PersonalCompetition) {
                for (int j = 0; j < spain2020.getAllAthletes().size(); j++) {
                    if (spain2020.getCompetitions().get(a).
                            getSportTypes() == Team.eSportTypes.RUNNING) {
                        ((PersonalCompetition) spain2020.getCompetitions().get(a))
                                .addAthleteToPersonalCompetition(spain2020.getAllAthletes().get(j));

                    } else {
                        ((PersonalCompetition) spain2020.getCompetitions().get(a))
                                .addAthleteToPersonalCompetition(spain2020.getAllAthletes().get(j));

                    }
                }
            }
        }
    }

    public List<Competition> getCompetitions() {
        return spain2020.getCompetitions();
    }

    public List<Athlete> getAthleteInSprcificCompetition(PersonalCompetition competition) {
        return competition.getPersonalCompetitionAthletes();
    }
    public List<Team> getTeamInSpecificCmpetition(TeamCompetition competition){
        return competition.getCompetitionTeams();
    }
    public ObservableList getInitialTableData(Competition c) {
        List list = new ArrayList();
        if(c instanceof  PersonalCompetition){
          list.addAll(getAthleteInSprcificCompetition((PersonalCompetition) c));
        }
        else{
         list.addAll(getTeamInSpecificCmpetition((TeamCompetition) c));
        }

        ObservableList data = FXCollections.observableList(list);
        return data;
    }


    public String getFinalWinners(){
        StringBuffer sb = new StringBuffer();
        sb.append(" The winners in countries are: \n" + spain2020.getWinnersInOlympicsByCountriesCompetitions());
        return sb.toString();
    }


}






