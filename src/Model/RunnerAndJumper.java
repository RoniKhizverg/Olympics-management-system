package Model;


public class RunnerAndJumper extends Athlete implements iRunner, iJumper {
    private Runner r;
    private Jumper j;

    public RunnerAndJumper(String name, int age, String gender, int highestSpeed, int highestJumping, String fromCountry) {
        super(name, age, gender, fromCountry);
        r = new Runner(name, age, gender, highestSpeed, fromCountry);
        j = new Jumper(name, age, gender, highestJumping, fromCountry);
    }

    public RunnerAndJumper(String name, int age, String gender, int highestSpeed, int highestJumping, int numOfMedals, String fromCountry) {
        super(name, age, gender, fromCountry);
        r = new Runner(name, age, gender, highestSpeed, fromCountry);
        j = new Jumper(name, age, gender, highestJumping, fromCountry);
        numOfMedals = getNumOfMedals();
    }

    @Override
    public String infoJumper() {

        return j.infoJumper();
    }

    @Override
    public int getHighestJumping() {
        return j.getHighestJumping();
    }

    @Override
    public String runnerInfo() {

        return r.runnerInfo();
    }

    @Override
    public int getHighestSpeed() {
        return r.getHighestSpeed();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("RunnerAndJumper ");
        sb.append("Name: " + super.getName() + " ,Age: " + super.getAge() + ", Gender: " + super.getGender() + ", Num of medals: " + getNumOfMedals() + " ,");
        sb.append(runnerInfo() + " ");
        sb.append(infoJumper() + "\n");
        return sb.toString();
    }
}




