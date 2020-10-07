package personalities;

import Olympics.Country;

public abstract class Athlete extends Person {
    public enum eSportTypes {running , jumping , runningAndJumping};


    private int numOfPersonalMedals;
    private eSportTypes sportType;
    public Athlete(String name, int age, String gender, Country country, int numOfMedals, eSportTypes sportType) {
        super(name, age, gender, country);
        this.sportType = sportType;
        this.numOfPersonalMedals = 0;
    }

    public int getNumOfMedals() {

        return numOfPersonalMedals;
    }

    public eSportTypes getSportType() {
        return sportType;
    }

    public void addNumOfMedals() {
        this.numOfPersonalMedals++;
    }

    @Override
    public String toString() {
        return super.toString()  + "numOfMedals: " + numOfPersonalMedals + ", sport type "  + sportType;
    }
}
