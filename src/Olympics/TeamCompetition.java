package Olympics;

import Time.Clock;
import personalities.*;

import java.util.ArrayList;
import java.util.List;

public class TeamCompetition {
    private final int maxOfTeams = 10;

    private Competition<TeamCompetition> competition;
    private Stadium stadium;
    private List<Team> teams;
    private Referee referee;
    private Athlete.eSportTypes sportTypes;
    private Time.Date startDate;
    private Time.Clock clock;


    public TeamCompetition(Stadium stadium, Referee referee, Athlete.eSportTypes sportTypes, Time.Date startDate, Clock clock) {
        this.startDate = new Time.Date(startDate);
        this.clock = new Time.Clock(clock);
        setStadium(stadium);
        this.sportTypes = sportTypes;
        if (referee instanceof RunnerReferee)
            this.referee = (RunnerReferee) referee;
        else
            this.referee = (JumpingReferee) referee;
        teams = new ArrayList<Team>();
        this.competition = new Competition<TeamCompetition>();
    }


    public List<Team> getListOfTeams() {
        return teams;
    }

    public Referee getReferee() {
        return referee;
    }


    public boolean addTeams(Team newTeams) {
        if (teams.size() < maxOfTeams) {
            if (newTeams.getSportTypes().equals((sportTypes))) {
                teams.add(newTeams);
                addCountries(newTeams);
                return true;
            }
        }
        return false;
    }

    public void addCountries(Team team) {
        competition.addCountry(team.getCountryName());
    }


    public List getTeamsDetails() {
        int numOfWinners = 0;
        while (numOfWinners != 3) {
            int randomWinners = (int) (Math.random() * teams.size());
            if (checkIfNoRepeatWinner(teams, teams.get(randomWinners))) {
                teams.set(numOfWinners, teams.get(randomWinners));
                teams.get(numOfWinners).addNumOfMedals();
                teams.get(numOfWinners).getCountryName().addNumOfMedals();
                numOfWinners++;
            }
        }
        return teams;
    }
    public String getWinners(){
        String allWinners = "";
        for(int i=0; i < 3;i ++){
            allWinners+=teams.get(i) +"\n" ;
        }
        return allWinners;
    }


    public static boolean checkIfNoRepeatWinner(List<Team> allWinners, Object team) {
        for (int i = 0; i < allWinners.size(); i++) {
            if (allWinners.get(i).equals(team)) {
                return false;
            }
        }
        return true;

    }

    public List<Country> getCompetition() {
        return competition.getCountries();
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonalCompetition { ");
        sb.append("stadium=").append(stadium);
        sb.append(", num Of team participants=").append(teams.size() + "\n");
        sb.append(referee + "\n");
        for (int i = 0; i < teams.size(); i++) {
            sb.append(teams.get(i).toString() + "\n");
        }
        sb.append("The winners are: " +getWinners() );
        sb.append('}');
        return sb.toString();
    }
}
