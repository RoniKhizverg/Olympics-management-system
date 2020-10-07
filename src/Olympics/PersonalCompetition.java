package Olympics;

import Time.Clock;
import personalities.*;

import java.util.*;

public class PersonalCompetition {
    private Competition<PersonalCompetition> competition;
    private Stadium stadium;
    private final int maxOfParticipants = 20;
    private List<Athlete> allAthletes;
    private Object occupation;
    private Referee referee;
    private Athlete.eSportTypes sportTypes;
    private Time.Date startDate;
    private Time.Clock clock;


    public PersonalCompetition(Stadium stadium, Referee referee, Athlete.eSportTypes sportTypes, Time.Date startDate, Clock clock) {
        this.startDate = new Time.Date(startDate);
        this.clock = new Time.Clock(clock);
        setStadium(stadium);
        this.sportTypes = sportTypes;
        if (referee instanceof RunnerReferee)
            this.referee = (RunnerReferee) referee;
        else
            this.referee = (JumpingReferee) referee;
        allAthletes = new ArrayList<Athlete>();
        this.competition = new Competition<PersonalCompetition>();
    }


    public List<Athlete> getAllAthletes() {
        return allAthletes;
    }

    public void setAllAthletes(List<Athlete> athletes) {
        this.allAthletes = allAthletes;
    }

    public Object getOccupation(Athlete object) {
        if (object instanceof Runner) {
            occupation = Runner.class.getSimpleName();
        } else if (object instanceof Jumper) {
            occupation = Jumper.class.getSimpleName();
        } else
            occupation = RunnerAndJumper.class.getSimpleName();
        return occupation;
    }


    public void setOccupation(Object occupation) {
        this.occupation = occupation;
    }

    public void addCountry(Athlete Object) {
        competition.addCountry(Object.getCountry());
    }

    public Exception addAthlete(Athlete newObject) {
        getOccupation(newObject);
        if (allAthletes.size() < maxOfParticipants) {
            if (newObject.getClass().getSimpleName().equals(occupation)) {
                if (newObject.getSportType().equals(sportTypes))
                    allAthletes.add(newObject);
                addCountry(newObject);
            }
        }
        return new Exception("You cant add this object to this competition");
    }


    public List getAllDetails() {
        int numOfWinners = 0;
        while (numOfWinners != 3) {
            int randomWinners = (int) (Math.random() * allAthletes.size());
            if (checkIfNoRepeatWinner(allAthletes, allAthletes.get(randomWinners))) {
                allAthletes.get(numOfWinners).addNumOfMedals();
                allAthletes.set(numOfWinners, allAthletes.get(randomWinners));
                allAthletes.get(numOfWinners).getCountry().addNumOfMedals();
                numOfWinners++;
            }
        }
        return allAthletes;
    }

    public static boolean checkIfNoRepeatWinner(List<Athlete> allWinners, Object winner) {
        for (int i = 0; i < allWinners.size(); i++) {
            if (allWinners.get(i).equals(winner)) {
                return false;
            }
        }
        return true;

    }

    public String getWinners() {
        String allWinners = "";
        for (int i = 0; i < 3; i++) {
            allWinners += allAthletes.get(i) + "\n";
        }
        return allWinners;
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
        sb.append(referee + "\n");
        for (int i = 0; i < allAthletes.size(); i++) {
            sb.append(allAthletes.get(i) + "\n");
        }
        sb.append("The winners are: " + getWinners());
        sb.append('}');
        return sb.toString();
    }
}
