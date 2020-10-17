package Model;


public abstract class Athlete extends Person {
    private String countryName;
    private int numOfPersonalMedals;

    public Athlete(String name, int age, String gender) {
        super(name, age, gender);
        this.numOfPersonalMedals = 0;
    }

    public Athlete(String name, int age, String gender, Country country) {
        super(name, age, gender);
        this.numOfPersonalMedals = numOfPersonalMedals;
        countryName = country.getCountryName();
    }

    public String getCountryName() {
        return countryName;
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
