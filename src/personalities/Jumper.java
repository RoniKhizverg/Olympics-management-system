package personalities;

public  class Jumper extends Athlete implements iJumper {
    private String typeOfSport;

    public Jumper(String name, int age, String gender, String country, int numOfMedals,String typeOfSport) {
        super(name, age, gender, country, numOfMedals);
        this.typeOfSport = typeOfSport;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    @Override
    public String toString() {
        return "Jumper: " + " typeOfSport - " + typeOfSport  +  " tostring = " + super.toString() ;
    }

    @Override
    public String infoJumper() {
        return "Jumper[ " + "typeOfSport='" + typeOfSport  + ']';
    }
}
