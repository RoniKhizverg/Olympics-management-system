package personalities;

public class Runner extends Athlete implements  iRunner {
    private String typeOfSport;

    public Runner(String name, int age, String gender, String country, int numOfMedals, String typeOfSport) {
        super(name, age, gender, country, numOfMedals);
        this.typeOfSport = typeOfSport;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    @Override
    public String toString() {
        return  "Runner :" + "typeOfSport - " + typeOfSport  +  " tostring = " + super.toString() ;
    }

    @Override
    public String runnerInfo() {
        return "Runner[ " + "typeOfSport='" + typeOfSport  + ']';
    }
}
