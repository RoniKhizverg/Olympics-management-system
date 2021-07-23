package Model;

import java.util.ArrayList;
import java.util.List;


public class Country {
	private String countryName;
	private String anthem;
	private int numOfMedals;
	private List<Team> countryTeams;
	private List<Athlete> allAthletes;
	private Referee referee;

	public Country(String countryName, String anthem) {
		this.countryName = countryName;
		this.anthem = anthem;
		this.allAthletes = new ArrayList<Athlete>();
		this.countryTeams = new ArrayList<Team>();
	}


	public boolean addAthlete(Athlete newAthlete) throws Exception {
		if (newAthlete instanceof Runner) {
			allAthletes.add((Runner) newAthlete);
			return true;
		} else if (newAthlete instanceof Jumper) {
			allAthletes.add((Jumper) newAthlete);
			return true;
		} else if(newAthlete instanceof RunnerAndJumper) {
			allAthletes.add((RunnerAndJumper) newAthlete);
			return true;
		}
		throw new Exception("You cant add this athlete");
	}


	public void addTeams(Team newTeams) throws Exception {
		countryTeams.add(newTeams);
	}

	public List<Team> getCountryTeams() {
		return countryTeams;
	}

	

	public List<Athlete> getAllAthletes() {
		return allAthletes;
	}

	public Country(Country other) {
		this.countryName = other.countryName;
		this.anthem = other.anthem;
		this.numOfMedals = other.numOfMedals;
	}
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAnthem() {
		return anthem;
	}

	
	public int getNumOfMedals() {
		return numOfMedals;
	}


	public void setNumOfMedals(int numOfMedals) {
		this.numOfMedals = numOfMedals;
	}

	public void addNumOfMedals() {
		this.numOfMedals++;
	}
	

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append(countryName);
		sb.append(", anthem='").append(anthem).append('\'');
		sb.append("num of medals in this country : " + numOfMedals + "\n");
		return sb.toString();
	}


}
