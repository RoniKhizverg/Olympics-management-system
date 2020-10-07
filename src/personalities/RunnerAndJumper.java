package personalities;

import Olympics.Country;

public class RunnerAndJumper extends Athlete implements iRunner, iJumper {
    private Runner r;
    private Jumper j;

    public RunnerAndJumper(String name, int age, String gender, Country country, int numOfMedals, eSportTypes sportType, int highestSpeed, int highestJumping) {
        super(name, age, gender, country, numOfMedals, sportType);
        r = new Runner(name, age, gender, country, numOfMedals, sportType, highestSpeed);
        j = new Jumper(name, age, gender, country, numOfMedals, sportType, highestJumping);
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
        StringBuffer sb = new StringBuffer("RunnerAndJumper {");
        sb.append("r=").append(r);
        sb.append(", j=").append(j);
        sb.append('}');
        return sb.toString();
    }
}




