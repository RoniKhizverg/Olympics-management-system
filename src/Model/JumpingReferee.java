package Model;


public class JumpingReferee extends Referee {
    private int numOfJumpingContestsRefereed;

    public JumpingReferee(String name, int age, String gender, int judgmentExperience, int numOfJumpingContestsRefereed) {
        super(name, age, gender, judgmentExperience);
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
        return  super.toString()  + "\n" ;
    }
}
