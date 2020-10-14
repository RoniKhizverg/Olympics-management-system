package Model;


public abstract class Competition  {
	private Stadium stadium;
	private Referee referee;
	private Team.eSportTypes sportTypes;
	private Date startDate;

	public Competition(Referee referee, Team.eSportTypes sportTypes, Date startDate, Stadium stadium) throws Exception {
		this.sportTypes = sportTypes;
		this.startDate = startDate;
		this.referee=referee;
		this.stadium = stadium;
		if(checkRefereeType()) {
		}
		
	}
//	public Date checkIfDateIsValid(Date endDate) {
//		if(startDate.getYear()==endDate.getYear())
//	}
	
	

	public  boolean checkRefereeType() throws Exception {
		if((sportTypes == sportTypes.RUNNING)&(referee instanceof RunnerReferee)) {
			return true;
		}
		else if((sportTypes == sportTypes.JUMPING)&(referee instanceof JumpingReferee)){
			return true;
		}	
			throw new Exception("cant add this referee to this sport type");
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
		sb.append( "Stadium: " + stadium + " referee: " + getReferee() + " ,sportTypes: " + getSportTypes() + " ,startDate: " + getStartDate());
		return sb.toString();
	}


}
