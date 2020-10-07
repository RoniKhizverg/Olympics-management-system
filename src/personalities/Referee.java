package personalities;

import Olympics.Country;

public abstract class Referee extends Person {
    public enum eJudgingType {running , jumping};


    private int JudgmentExperience;
    private eJudgingType judgingType;

    public Referee(String name, int age, String gender, Country country, int judgmentExperience, eJudgingType judgingType) {
        super(name, age, gender, country);
        this.JudgmentExperience=judgmentExperience;
        this.judgingType = judgingType;
    }

    public int getJudgmentExperience() {

        return JudgmentExperience;
    }

    public void setJudgmentExperience(int judgmentExperience) {
        JudgmentExperience = judgmentExperience;
    }

    public eJudgingType getJudgingType() {
        return judgingType;
    }

    @Override
    public String toString() {
     return  super.toString() + " Jurisdiction: " + judgingType + ", Judgment Experience: " + JudgmentExperience + " years" ;
    }
}
