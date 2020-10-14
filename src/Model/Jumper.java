package Model;


public  class Jumper extends Athlete implements iJumper {
    private int highestJumping;

    public Jumper(String name, int age, String gender, int highestJumping) {
        super(name, age, gender);
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
        return "Jumper: "  + super.toString() + ", highest jumping: " + highestJumping + " meters "  + '\n';
    }

    @Override
    public String infoJumper() {
        return  "highest jumping: " + highestJumping   + " meters " ;
    }
}
