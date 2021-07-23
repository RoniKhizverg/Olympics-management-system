package Model;


public class JumpingReferee extends Referee {
    private int numOfJumpingContestsRefereed;

    public JumpingReferee(String name, int age, String gender, int judgmentExperience, int numOfJumpingContestsRefereed,String fromCountry) {
        super(name, age, gender, judgmentExperience,fromCountry);
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
