package Controller;

import Model.*;
import Model.Date;
import View.OlympicView;


import java.util.ArrayList;
import java.util.*;


public class Controller {
    private Olympics spain2020;
    private OlympicView olympicView;


    public Controller(Olympics spain2020, OlympicView olympicView) throws Exception {
        this.spain2020 = spain2020;
        this.olympicView = olympicView;

        olympicView.getL2().setText("Start Date: " + spain2020.getStartDate() + "\nEnd date: " + spain2020.getEndDate());
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
                    if (spain2020.getCompetitions().get(a).getSportTypes() == Team.eSportTypes.RUNNING) {
                        ((PersonalCompetition) spain2020.getCompetitions().get(a))
                                .addAthleteToPersonalCompetition(spain2020.getAllAthletes().get(j));

                    } else {
                        ((PersonalCompetition) spain2020.getCompetitions().get(a))
                                .addAthleteToPersonalCompetition(spain2020.getAllAthletes().get(j));

                    }
                }
            }

        }
       // olympicView.getButton2().setEv
    }
}


