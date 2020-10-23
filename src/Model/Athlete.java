package Model;


public abstract class Athlete extends Person {
    private int numOfPersonalMedals;

    public Athlete(String name, int age, String gender,String fromCountry) {
        super(name, age, gender,fromCountry);
        this.numOfPersonalMedals = 0;
    }



    public int getNumOfMedals() {

        return numOfPersonalMedals;
    }



    public void addNumOfMedals() {
        this.numOfPersonalMedals++;
    }

    @Override
    public String toString() {
        return super.toString()  + "num Of medals: " + numOfPersonalMedals ;
    }
}
