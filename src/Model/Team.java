package Model;


import java.util.ArrayList;
import java.util.List;

public class Team {
	public enum eSportTypes {
		RUNNING, JUMPING
	};

	private List<Athlete> stateTeam;
	private int numOfTeamsMedals;
	private eSportTypes sportTypes;
	private String teamName;

	public Team(String teamName, eSportTypes sportTypes) {
		this.teamName = teamName;
		this.numOfTeamsMedals = 0;
		this.sportTypes = sportTypes;
		stateTeam = new ArrayList<Athlete>();
	}
	public Team(String teamName, eSportTypes sportTypes,int numOfTeamsMedals) {
		this.teamName = teamName;
		this.sportTypes = sportTypes;
		stateTeam = new ArrayList<Athlete>();
		this.numOfTeamsMedals = numOfTeamsMedals;
	}

	public Exception addAthlete(Athlete newAthlete) throws Exception {
		if ((sportTypes == eSportTypes.RUNNING)
				& ((newAthlete instanceof Runner) || (newAthlete instanceof RunnerAndJumper))) {
			stateTeam.add(newAthlete);
		} else if (((sportTypes == eSportTypes.JUMPING)
				& ((newAthlete instanceof Jumper) || (newAthlete instanceof RunnerAndJumper)))) {
			stateTeam.add(newAthlete);
		}
		return new Exception("You cant add this type of athlete to this team");
	}

	public void addNumOfMedals() {
		this.numOfTeamsMedals++;
	}

	public String getTeamName() {
		return teamName;
	}

	public List<Athlete> getStateTeam() {
		return stateTeam;
	}

	public void setStateTeam(List<Athlete> stateTeam) {
		this.stateTeam = stateTeam;
	}

	public int getNumOfTeamsMedals() {
		return numOfTeamsMedals;
	}

	public eSportTypes getSportTypes() {
		return sportTypes;
	}
	public void addNumOfMedalsToTeam() {
		this.numOfTeamsMedals++;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Team:" + teamName + '\n');
		sb.append("Num of medals: " + numOfTeamsMedals + '\n');
		for (int i = 0; i < stateTeam.size(); i++) {
			sb.append(stateTeam.get(i).toString() + '\n');
		}
		return sb.toString();
	}
}
