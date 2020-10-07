package personalities;

import Olympics.Country;

public class JumpingReferee extends Referee {
    private int numOfJumpingContestsRefereed;

    public JumpingReferee(String name, int age, String gender, Country country, int judgmentExperience, eJudgingType judgingType, int numOfJumpingContestsRefereed) {
        super(name, age, gender, country, judgmentExperience,judgingType);
        this.numOfJumpingContestsRefereed = numOfJumpingContestsRefereed;
    }

    public int getNumOfJumpingContestsRefereed() {
        return numOfJumpingContestsRefereed;
    }

    public void setNumOfJumpingContestsRefereed(int numOfJumpingContestsRefereed) {
        this.numOfJumpingContestsRefereed = numOfJumpingContestsRefereed;
    }

    @Override
    public String toString() {
        return "Jumping Referee: "  + super.toString() + ']' ;
    }
}
