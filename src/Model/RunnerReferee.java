package Model;


public class RunnerReferee extends Referee {
    private int numOfRunningContestsRefereed;


    public RunnerReferee(String name, int age, String gender, int judgmentExperience, int numOfRunningContestsRefereed) {
        super(name, age, gender, judgmentExperience );
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
        return "Runner Referee: " + super.toString() + "num of running contest refereed: " + numOfRunningContestsRefereed+ ']'+ "\n" ;
    }

}
