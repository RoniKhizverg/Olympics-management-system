package personalities;

import Olympics.Country;

public class RunnerReferee extends Referee {
    private int numOfRunningContestsRefereed;


    public RunnerReferee(String name, int age, String gender, Country country, int judgmentExperience, eJudgingType judgingType, int numOfRunningContestsRefereed) {
        super(name, age, gender, country, judgmentExperience, judgingType );
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
        return "Runner Referee: " + "num of running contest refereed: " + numOfRunningContestsRefereed + super.toString() + ']' ;
    }

}
