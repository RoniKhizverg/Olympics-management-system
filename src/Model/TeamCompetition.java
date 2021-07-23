package Model;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TeamCompetition extends Competition implements iCompetition {
    private List<Team> teams, teamWinners;

    public TeamCompetition(Referee referee, Team.eSportTypes sportTypes, Date startDate, Stadium stadium) throws Exception {
        super(referee, sportTypes, startDate, stadium);
        this.teams = new ArrayList<>();
        teamWinners = new ArrayList<>();
    }

    public List<Team> getCompetitionTeams() {
        return teams;
    }

    public boolean addTeamsToCompetition(Team newTeams) throws Exception {
        for (Team team : teams) {
            if (team.equals(newTeams)) {
                throw new Exception("The team is already exist!");
            }
        }
        if (newTeams.getSportTypes().equals(getSportTypes())) {
            teams.add(newTeams);
            return true;
        } else
            throw new Exception("you can't to add this team to the specific in this competition");
    }

    public List<Team> getWinnersInTeams() {
        int numOfWinners = 0;
        while (numOfWinners != 3) {
            int randomWinners = (int) (Math.random() * teams.size());
            if (checkIfNoRepeatWinner(teamWinners, teams.get(randomWinners))) {
                teamWinners.add(teams.get(randomWinners));
                teams.get(randomWinners).addNumOfMedals();
                numOfWinners++;
            }
        }
        sortByNumOfMedals();
        return teamWinners;
    }


    public void sortByNumOfMedals() {
        Comparator<Team> compareByTeamsMedals = (team1, team2) -> {
            if (team1.getNumOfTeamsMedals() < team2.getNumOfTeamsMedals()) {
                return 1;
            } else if (team1.getNumOfTeamsMedals() == team2.getNumOfTeamsMedals()) {
                return 0;
            }
            return -1;
        };
        teams.sort(compareByTeamsMedals);

    }

    public List<Team> getTeamsWinners() {
        return teamWinners;
    }

    public static boolean checkIfNoRepeatWinner(List<Team> allWinners, Team team) {
        for (Team allWinner : allWinners) {
            if (allWinner.equals(team)) {
                return false;
            }
        }
        return true;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" num Of participating teams: ").append(teams.size()).append("\n");
        for (Team team : teams) {
            sb.append(team.toString()).append("\n");
        }
        return super.toString() + sb.toString();
    }

    @Override
    public String getInfo() {
        return super.toString();
    }
}
