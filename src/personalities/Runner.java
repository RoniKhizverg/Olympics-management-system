package personalities;

import Olympics.Country;

public class Runner extends Athlete implements  iRunner {
    private int highestSpeed;

    public Runner(String name, int age, String gender, Country country, int numOfMedals, eSportTypes sportType , int highestSpeed) {
        super(name, age, gender, country, numOfMedals,sportType);
        this.highestSpeed = highestSpeed;
    }

    public int getHighestSpeed() {
        return highestSpeed;
    }

    public void setHighestSpeed(int highestSpeed) {
        this.highestSpeed = highestSpeed;
    }

    @Override
    public String toString() {
        return  "Runner:"   + super.toString() + ", highest speed:" + highestSpeed  + " kmh" +" ]" +'\n' ;
    }

    @Override
    public String runnerInfo() {
        return "Runner[ " + "highest speed:" + highestSpeed  ;
    }
}
