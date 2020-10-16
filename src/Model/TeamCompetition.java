package Model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TeamCompetition extends Competition {
	private List<Team> competitionTeams,teamWinners;

	public TeamCompetition(Referee referee, Team.eSportTypes sportTypes, Date startDate, Stadium stadium) throws Exception {
		super(referee, sportTypes, startDate,stadium);
		this.competitionTeams = new ArrayList<Team>();
		teamWinners = new ArrayList<Team>();
	}

	public List<Team> getCompetitionTeams() {
		return competitionTeams;
	}

	public boolean addTeamsToCompetition(Team newTeams) throws Exception {
		if (newTeams.getSportTypes().equals(getSportTypes())){
			competitionTeams.add(newTeams);
			return true;
		}
		else
			throw new Exception("you cant to add this team to the specific in this competiton");
	}

	public List<Team> getWinnersinTeams() {
		int numOfWinners = 0;
		while (numOfWinners != 3) {
			int randomWinners = (int) (Math.random() * competitionTeams.size());
			if (checkIfNoRepeatWinner(teamWinners, competitionTeams.get(randomWinners))) {
				teamWinners.add(competitionTeams.get(randomWinners));
				competitionTeams.get(randomWinners).addNumOfMedals();
				numOfWinners++;
			}
		}
		sortByNumOfMedals();
		return teamWinners;
	}


	public void sortByNumOfMedals() {
		Comparator<Team> compareByTeamsMedals = new Comparator<Team>() {

			public int compare(Team o1, Team o2) {
				if (o1.getNumOfTeamsMedals() < o2.getNumOfTeamsMedals()) {
					return 1;
				} else if (o1.getNumOfTeamsMedals() == o2.getNumOfTeamsMedals()) {
					return 0;
				}
				return -1;
			}
		};
		Collections.sort(competitionTeams, compareByTeamsMedals);

	}

	public List<Team> getTeamsWinners() {
		return teamWinners;
	}

	public static boolean checkIfNoRepeatWinner(List<Team> allWinners, Team team) {
		for (int i = 0; i < allWinners.size(); i++) {
			if (allWinners.get(i).equals(team)) {
				return false;
			}
		}
		return true;

	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append(" num Of participating teams: ").append(competitionTeams.size() + "\n");
		for (int i = 0; i < competitionTeams.size(); i++) {
			sb.append(competitionTeams.get(i).toString() + "\n");
		}
		return super.toString() +sb.toString() ;
	}

}
