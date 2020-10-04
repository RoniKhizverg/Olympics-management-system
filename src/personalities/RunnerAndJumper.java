package personalities;

public class RunnerAndJumper extends Athlete implements  iRunner,iJumper {
    private Runner r;
    private Jumper j;

    public RunnerAndJumper(String name, int age, String gender, String country, int numOfMedals,String typeOfSport) {
        super(name, age, gender, country, numOfMedals);
        r = new Runner(name, age, gender, country, numOfMedals, typeOfSport);
        j = new Jumper(name, age, gender, country, numOfMedals, typeOfSport);
    }
    public String getTypeOfSport(){
        return r.getTypeOfSport();
    }
    public String getTypeOfSportInJumper(){
        return j.getTypeOfSport();
    }

    @Override
    public String infoJumper() {
        return j.infoJumper();
    }

    @Override
    public String runnerInfo() {
        return r.runnerInfo();
    }
}
