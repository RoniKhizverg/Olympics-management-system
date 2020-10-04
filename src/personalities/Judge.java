package personalities;

public abstract class Judge extends Person {
    private int JudgmentExperience;

    public Judge(String name, int age, String gender, String country,int judgmentExperience) {
        super(name, age, gender, country);
        this.JudgmentExperience=judgmentExperience;
    }

    public int getJudgmentExperience() {
        return JudgmentExperience;
    }

    @Override
    public String toString() {
     return "Judge: " + "JudgmentExperience=" + JudgmentExperience + "to string = " + super.toString();
    }
}
