package Model;


public abstract class Referee extends Person {

    private int JudgmentExperience;

    public Referee(String name, int age, String gender, int judgmentExperience) {
        super(name, age, gender);
        this.JudgmentExperience=judgmentExperience;
    }

    public int getJudgmentExperience() {

        return JudgmentExperience;
    }

    public void setJudgmentExperience(int judgmentExperience) {
        JudgmentExperience = judgmentExperience;
    }


    @Override
    public String toString() {
     return  super.toString() + " Jurisdiction: " + ", Judgment Experience: " + JudgmentExperience + " years" ;
    }
}
