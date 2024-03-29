package Model;


public class Runner extends Athlete implements  iRunner {
    private int highestSpeed;

    public Runner(String name, int age, String gender , int highestSpeed,String fromCountry) {
        super(name, age, gender,fromCountry);
        this.highestSpeed = highestSpeed;
    }

    public Runner(String name, int age, String gender , int highestSpeed,int numOfMedals,String fromCountry) {
        super(name,age,gender,fromCountry);
        numOfMedals = getNumOfMedals();
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
        return  "Runner:"   + super.toString() + ", highest speed: " + highestSpeed  + " kmh"  +'\n' ;
    }

    @Override
    public String runnerInfo() {
        return  "highest speed: " + highestSpeed  ;
    }


}
