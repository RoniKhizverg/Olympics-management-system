package personalities;

import Olympics.Country;

public  class Jumper extends Athlete implements iJumper {
    private int highestJumping;

    public Jumper(String name, int age, String gender, Country country, int numOfMedals, eSportTypes sportType, int highestJumping) {
        super(name, age, gender, country, numOfMedals,sportType);
        this.highestJumping = highestJumping;
    }

    public int getHighestJumping() {
        return highestJumping;
    }

    public void setHighestJumping(int highestJumping) {
        this.highestJumping = highestJumping;
    }

    @Override
    public String toString() {
        return "Jumper: "  + super.toString() + ", highest jumping: " + highestJumping + " meters " + " ]" + '\n';
    }

    @Override
    public String infoJumper() {
        return "Jumper[ " + "highest jumping: " + highestJumping   + " meters " + ']';
    }
}
