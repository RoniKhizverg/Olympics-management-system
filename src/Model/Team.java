package Model;


import java.util.ArrayList;
import java.util.List;

public class Team {
    public enum eSportTypes {
        RUNNING, JUMPING
    }


    private List<Athlete> stateTeam;
    private int numOfTeamsMedals;
    private eSportTypes sportTypes;
    private String teamName;
    private String fromCountry;

    public Team(String teamName, eSportTypes sportTypes) {
        this.teamName = teamName;
        this.numOfTeamsMedals = 0;
        this.sportTypes = sportTypes;
        stateTeam = new ArrayList<Athlete>();
    }

    public Team(String teamName, eSportTypes sportTypes, String fromCountry) {
        this.numOfTeamsMedals = 0;
        this.sportTypes = sportTypes;
        this.teamName = teamName;
        this.fromCountry = fromCountry;
        stateTeam = new ArrayList<Athlete>();
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public boolean addAthlete(Athlete newAthlete) throws Exception {
        for (int i = 0; i < stateTeam.size(); i++) {
            if (stateTeam.get(i).equals(newAthlete)) {
                throw new Exception("This athlete already exist");
            }
        }
        if (!newAthlete.getFromCountry().equalsIgnoreCase(fromCountry)) {
            throw new Exception("You cannot add athlete from another country");
        }
        if ((sportTypes == eSportTypes.RUNNING)
                & ((newAthlete instanceof Runner) || (newAthlete instanceof RunnerAndJumper))) {
            stateTeam.add(newAthlete);
            return true;
        } else if (((sportTypes == eSportTypes.JUMPING)
                & ((newAthlete instanceof Jumper) || (newAthlete instanceof RunnerAndJumper)))) {
            stateTeam.add(newAthlete);
            return true;
        }
        throw new Exception("You cant add this type of athlete to this team");
    }

    public void addNumOfMedals() {
        this.numOfTeamsMedals++;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Athlete> getStateTeam() {
        return stateTeam;
    }

    public void setStateTeam(List<Athlete> stateTeam) {
        this.stateTeam = stateTeam;
    }

    public int getNumOfTeamsMedals() {
        return numOfTeamsMedals;
    }

    public eSportTypes getSportTypes() {
        return sportTypes;
    }

    public void addNumOfMedalsToTeam() {
        this.numOfTeamsMedals++;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Team:" + teamName + '\n');
        sb.append("Num of medals: " + numOfTeamsMedals + '\n');
        for (int i = 0; i < stateTeam.size(); i++) {
            sb.append(stateTeam.get(i).toString() + '\n');
        }
        return sb.toString();
    }
}
