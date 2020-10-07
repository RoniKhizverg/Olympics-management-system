package Olympics;

import personalities.Athlete;
import personalities.Jumper;
import personalities.Runner;
import personalities.RunnerAndJumper;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private Country countryName;
    private List<Athlete> stateTeam;
    private int numOfTeamsMedals;
    private Object object;
    private Athlete.eSportTypes sportTypes;


    public Team(int numOfTeamsMedals, Country countryName, Athlete.eSportTypes sportTypes) {
        this.numOfTeamsMedals = 0;
        this.sportTypes = sportTypes;
        this.countryName = countryName;
        stateTeam = new ArrayList<Athlete>();
        this.object=getIdentifyAthlete();
    }

    public boolean addAthlete(Athlete newObject) {
        if (newObject.getClass().getSimpleName().equals(object)) {
            if (newObject.getSportType().equals(sportTypes)) {
                stateTeam.add(newObject);
                return true;
            }
        }
        return false;
    }

    public Object getIdentifyAthlete() {
        if (sportTypes== Athlete.eSportTypes.running ){
            object =  Runner.class.getSimpleName();
        }
         else if (sportTypes== Athlete.eSportTypes.jumping) {
            object = Jumper.class.getSimpleName();
        } else
            object =  RunnerAndJumper.class.getSimpleName();
        return  object;
    }
    public void addNumOfMedals() {
        this.numOfTeamsMedals++;
    }

    public int getAllMedals(){
        int numOfMedals=0;
        for( int i=0; i < stateTeam.size();i++){
                numOfMedals+=stateTeam.get(i).getNumOfMedals();
            }
        return numOfMedals;
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



    public void setNumOfTeamsMedals(int numOfTeamsMedals) {
        this.numOfTeamsMedals = numOfTeamsMedals;
    }

    public Country getCountryName() {
        return countryName;
    }


    public Athlete.eSportTypes getSportTypes() {
        return sportTypes;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Team:" + countryName + '\n');
        sb.append("Num of medals: " + numOfTeamsMedals + '\n');
        for (int i = 0; i < stateTeam.size(); i++) {
            sb.append(stateTeam.get(i).toString() + '\n');
        }
        return sb.toString();
    }
}


