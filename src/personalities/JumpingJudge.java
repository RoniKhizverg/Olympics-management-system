package personalities;

public class JumpingJudge extends  Judge implements  iJudge{
    private String typeOfSport;

    public JumpingJudge(String name, int age, String gender, String country, int judgmentExperience,String typeOfSport) {
        super(name, age, gender, country, judgmentExperience);
        this.typeOfSport= typeOfSport;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    @Override
    public String toString() {
        return "JumpingJudge : " + "typeOfSport- " + typeOfSport + "to string = "  + super.toString() ;
    }
}
