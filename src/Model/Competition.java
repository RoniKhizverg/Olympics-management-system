package Model;


public abstract class Competition implements iCompetition {
    private Stadium stadium;
    private Referee referee;
    private Team.eSportTypes sportTypes;
    private Date startDate;

    public Competition(Referee referee, Team.eSportTypes sportTypes, Date startDate, Stadium stadium) throws Exception {
        this.sportTypes = sportTypes;
        this.startDate = startDate;
        this.stadium = stadium;
        if ((sportTypes == sportTypes.RUNNING) & (referee instanceof JumpingReferee)) {
            throw new Exception("cant add this referee to this sport type");
        } else if ((sportTypes == sportTypes.JUMPING) & (referee instanceof RunnerReferee)) {
            throw new Exception("cant add this referee to this sport type");
        }
        this.referee = referee;
    }


    public Referee getReferee() {
        return referee;
    }

    public Team.eSportTypes getSportTypes() {
        return sportTypes;
    }

    public Date getStartDate() {
        return startDate;
    }


    public Stadium getStadium() {
        return stadium;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        sb.append("Competition start Date: " + getStartDate() + "\n\nStadium: " + stadium + "\n Referee: " + getReferee() + " ,sportTypes: " + getSportTypes() + "\n\n");
        return sb.toString();
    }


}
