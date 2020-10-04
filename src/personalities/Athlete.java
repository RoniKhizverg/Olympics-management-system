package personalities;

public abstract class Athlete extends Person {
    private int numOfMedals;

    public Athlete(String name, int age, String gender, String country,int numOfMedals) {
        super(name, age, gender, country);
        this.numOfMedals = 0;
    }

    public int getNumOfMedals() {

        return numOfMedals;
    }

    public void addNumOfMedals() {
        this.numOfMedals++;
    }

    @Override
    public String toString() {
        return super.toString() + " \n Athlete [" + "numOfMedals=" + numOfMedals + ']';
    }
}
