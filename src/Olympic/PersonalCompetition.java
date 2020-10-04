package Olympic;

import personalities.Athlete;
import personalities.Jumper;
import personalities.Runner;
import personalities.RunnerAndJumper;

import javax.swing.*;
import java.util.*;

public class PersonalCompetition {
    private Stadium stadium;
    private int numOfParticipants;
    private List <Object> obj = new ArrayList<Object>();
    private Object occupation;

    public PersonalCompetition(Stadium stadium, int numOfParticipants,Object occupation) {
        setStadium(stadium);
        this.numOfParticipants = numOfParticipants;
        equals(occupation);
    }

    public List<Object> getObj() {
        return obj;
    }

    public void setObj(List<Object> obj) {
        this.obj = obj;
    }

    public Object getOccupation() {
        return occupation;
    }

    public void setOccupation(Object occupation) {
        this.occupation = occupation;
    }

    public boolean equals(Object obj)  {
        if (obj instanceof Runner) {
            obj = new ArrayList<Runner>();
            return true;
        } else if (obj instanceof Jumper) {
            obj = new ArrayList<Jumper>();
            return true;
        }
        else {
            obj = new ArrayList<RunnerAndJumper>();
            return true;
        }
    }

    public Exception addAthlete(Object newObject)  {
        if (newObject.equals(occupation)) {
            obj.add(newObject);
        }
        return new Exception("You cant add this object to this competition");
    }
    public List getWinners() {
        int numOfWinners=0;
        List<Athlete> winners = new ArrayList<Athlete>();
        while(winners.size()!=3){
            int randomWinners = (int) (Math.random() * obj.size() - 1);
            if(checkIfNoRepeatWinner(winners, obj.get(randomWinners).toString()) ) {
                winners.add((Athlete) obj.get(randomWinners)) ;
                winners.get(numOfWinners).addNumOfMedals();
                numOfWinners++;
                 }
            }
        return winners;
    }

    public static boolean checkIfNoRepeatWinner(List<Athlete> allWinners, String answer) {
        for (int i = 0; i < allWinners.size(); i++) {
            if (allWinners.get(i).equals(answer)) {
                return false;
            }
        }
            return true;

    }

        public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }


    public int getNumOfParticipants() {
        return numOfParticipants;
    }

    public void setNumOfParticipants(int numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }

}
