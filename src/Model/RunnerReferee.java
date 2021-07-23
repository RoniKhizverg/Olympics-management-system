package Model;


public class RunnerReferee extends Referee {
    private int numOfRunningContestsRefereed;


    public RunnerReferee(String name, int age, String gender, int judgmentExperience, int numOfRunningContestsRefereed, String fromCountry) {
        super(name, age, gender, judgmentExperience, fromCountry);
        this.numOfRunningContestsRefereed = numOfRunningContestsRefereed;
    }

    public int getNumOfRunningContestsRefereed() {
        return numOfRunningContestsRefereed;
    }

    public void setNumOfRunningContestsRefereed(int numOfRunningContestsRefereed) {
        this.numOfRunningContestsRefereed = numOfRunningContestsRefereed;
    }

    @Override
    public String toString() {
        return super.toString() + "num of running contest refereed: " + numOfRunningContestsRefereed + "\n";
    }

}
