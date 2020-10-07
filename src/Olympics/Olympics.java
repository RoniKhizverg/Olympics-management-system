package Olympics;

import Time.Date;
import personalities.Athlete;

import java.util.*;

import java.util.Comparator;


public class Olympics {
    private String olympicLocation;
    private Date startDate;
    private Date endDate;
    private Competition<PersonalCompetition> personalCompetitions;
    private Competition<TeamCompetition> teamCompetitions;
    private int numOfPersonalsCompetitions;
    private int numOfTeamsCompetition;
    private List<Country> allCountries;


    public Olympics(Date startDate, Date endDate) {
        this.numOfPersonalsCompetitions = 0;
        this.numOfTeamsCompetition = 0;
        this.startDate = startDate;
        this.endDate = endDate;
        personalCompetitions = new Competition<PersonalCompetition>();
        teamCompetitions = new Competition<TeamCompetition>();
        allCountries = new ArrayList<Country>();
    }

    public void addPersonalCompetition(PersonalCompetition newCompetition) {
        if (newCompetition instanceof PersonalCompetition) {
            personalCompetitions.add(newCompetition);
            numOfPersonalsCompetitions++;
        }
    }

    public void listOfCountries() {
        for (int i = 0; i < numOfTeamsCompetition; i++) {
            allCountries.addAll(teamCompetitions.getCountries());
        }
        for (int j = 0; j < numOfPersonalsCompetitions; j++) {
            allCountries.addAll(personalCompetitions.getCountries());
        }
    }

    public void addTeamCompetition(TeamCompetition newCompetition) {
        if (newCompetition instanceof TeamCompetition) {
            teamCompetitions.add(newCompetition);
            numOfTeamsCompetition++;
        }
    }

    public String getPersonalDetailsByRunning() {
        Competition<Competition> personalCompetitionInRunning = new Competition<Competition>();
        for (int i = 0; i < numOfPersonalsCompetitions; i++) {
            if (personalCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.running) {
                personalCompetitionInRunning.add(personalCompetitions);
                sortAthletes(personalCompetitions.getCompetitionType().getAllAthletes());
            }
        }

        return sortPersonalCompetition((List) personalCompetitionInRunning);
    }

    public String getPersonalDetailsByJumping() {
        Competition<Competition> personalCompetitionInJumping = new Competition<Competition>();
        for (int i = 0; i < numOfPersonalsCompetitions; i++) {
            if (personalCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.running) {
                personalCompetitionInJumping.add(personalCompetitions);
                sortAthletes(personalCompetitions.getCompetitionType().getAllAthletes());
            }
        }

        return sortPersonalCompetition((List) personalCompetitionInJumping);
    }

    public String getTeamDetailsByRunning() {
        Competition<Competition> teamCompetitionOnlyInRunning = new Competition<Competition>();
        for (int j = 0; j < numOfTeamsCompetition; j++) {
            if (teamCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.running) {
                teamCompetitionOnlyInRunning.add(teamCompetitions);
                sortTeams(teamCompetitions.getCompetitionType().getListOfTeams());
            }
        }
        return sortList((List) (teamCompetitionOnlyInRunning));
    }

    public String getTeamDetailsByJumping() {
        Competition<Competition> teamCompetitionOnlyInJumping = new Competition<Competition>();
        for (int j = 0; j < numOfTeamsCompetition; j++) {
            if (teamCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.jumping) {
                teamCompetitionOnlyInJumping.add(teamCompetitions);
                sortTeams(teamCompetitions.getCompetitionType().getListOfTeams());
            }
        }
        return sortList((List) teamCompetitionOnlyInJumping);
    }

    public String getCountriesDetails() {

        return sortCountriesByMedals(allCountries);
    }


    public String sortCountriesByMedals(List<Country> allCountries) {
        Comparator<Country> compareByCountries = new Comparator<Country>() {
            public int compare(Country o1, Country o2) {
                searchSameCountries(o1, o2);
                if (o1.getNumOfMedals() < o2.getNumOfMedals()) {
                    return -1;
                } else if (o1.getNumOfMedals() == o2.getNumOfMedals()) {
                    return 0;
                }
                return 1;
            }
        };
        Collections.sort(allCountries, compareByCountries);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < allCountries.size(); i++) {
            sb.append((allCountries.get(i).toString()));
        }
        return sb.toString();

    }

    private void searchSameCountries(Country original, Country replace) {
        Collection<Country> countries = allCountries;
        for (Country country : countries) {
            original = null;
            if (country.getCountryName().equals(replace.getCountryName())) {
                original = country;
                break;
            }
            if (original != null) {
                int numOfMedalsTotals = original.getNumOfMedals() + replace.getNumOfMedals();
                Country replacement = new Country(original);
                replacement.setNumOfMedals(numOfMedalsTotals);
                replacement.setCountryName(original.getCountryName());
                replacement.setAnthem(original.getAnthem());
                countries.remove(original);
                countries.add(replacement);
            }
        }
    }


    public static <E> String sortList(List<TeamCompetition> list) {
        Comparator<TeamCompetition> compareByMedals = new Comparator<TeamCompetition>() {
            public int compare(TeamCompetition o1, TeamCompetition o2) {
                if (o1.getListOfTeams().get(0).getNumOfTeamsMedals() < o2.getListOfTeams().get(0).getNumOfTeamsMedals()) {
                    return -1;
                } else if (o1.getListOfTeams().get(0).getNumOfTeamsMedals() == o2.getListOfTeams().get(0).getNumOfTeamsMedals()) {
                    return 0;
                }
                return 1;
            }
        };
        Collections.sort(list, compareByMedals);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append((list.get(i).toString()));
        }
        return sb.toString();


    }


    private void sortTeams(List<Team> listOfTeams) {
        Comparator<Team> compareByTeamsMedals = new Comparator<Team>() {

            public int compare(Team o1, Team o2) {
                if (o1.getNumOfTeamsMedals() < o2.getNumOfTeamsMedals()) {
                    return -1;
                } else if (o1.getNumOfTeamsMedals() == o2.getNumOfTeamsMedals()) {
                    return 0;
                }
                return 1;
            }
        };
        Collections.sort(listOfTeams, compareByTeamsMedals);

    }

    private String sortPersonalCompetition(List<PersonalCompetition> list) {
        Comparator<PersonalCompetition> compareByMedals = new Comparator<PersonalCompetition>() {
            public int compare(PersonalCompetition o1, PersonalCompetition o2) {
                if (o1.getAllAthletes().get(0).getNumOfMedals() < o2.getAllAthletes().get(0).getNumOfMedals()) {
                    return -1;
                } else if (o1.getAllAthletes().get(0).getNumOfMedals() == o2.getAllAthletes().get(0).getNumOfMedals()) {
                    return 0;
                }
                return 1;
            }
        };
        Collections.sort(list, compareByMedals);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append((list.get(i).toString()));
        }
        return sb.toString();

    }

    public static void sortAthletes(List<Athlete> allAthletes) {
        Comparator<Athlete> compareByMedals = new Comparator<Athlete>() {
            public int compare(Athlete o1, Athlete o2) {
                if (o1.getNumOfMedals() < o2.getNumOfMedals())
                    return -1;
                else if (o1.getNumOfMedals() == o2.getNumOfMedals())
                    return 0;
                return 1;
            }
        };

    }

    public String getWinnersInOlympicsByPersonalCompetitionsInRunning() {
        String personalWinners = "";
        if (teamCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.running) {
            for (int i = 0; i < 3; i++) {
                personalWinners += personalCompetitions.getCompetitionType().getAllAthletes().get(i) + "\n";
            }
        }
        return personalWinners;
    }

    public String getWinnersInOlympicsByPersonalCompetitionsInJumping() {
        String personalWinners = "";
        if (teamCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.jumping) {
            for (int i = 0; i < 3; i++) {
                personalWinners += personalCompetitions.getCompetitionType().getAllAthletes().get(i) + "\n";
            }
        }
        return personalWinners;
    }

    public String getWinnersInOlympicsByTeamCompetitionsByRunning() {
        String teamWinners = "";
        if (teamCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.running) {
            for (int i = 0; i < 3; i++) {
                teamWinners += teamCompetitions.getCompetitionType().getListOfTeams().get(i) + "\n";
            }
        }
        return teamWinners;
    }

    public String getWinnersInOlympicsByTeamCompetitionsByJumping() {
        String teamWinners = "";
        if (teamCompetitions.getCompetitionType().getSportTypes() == Athlete.eSportTypes.jumping) {
            for (int i = 0; i < 3; i++) {
                teamWinners += teamCompetitions.getCompetitionType().getListOfTeams().get(i) + "\n";
            }
        }
        return teamWinners;
    }


    public String getWinnersInOlympicsByCountriesCompetitions() {
        String countriesWinners = "";
        for (int i = 0; i < 3; i++) {
            countriesWinners += allCountries.get(i) + "\n";
        }
        return countriesWinners;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Olympics");
        sb.append(" Welcome to the olympics games!!! " + '\n');
        sb.append("The olympics occur in " + olympicLocation + " in:" + startDate + '\n');
        sb.append("The list of the countries : " + getCountriesDetails() + '\n');
        sb.append(" The list of the teams in running: " + getTeamDetailsByRunning() + '\n');
        sb.append(" The list of the teams in jumping : " + getTeamDetailsByJumping() + '\n');
        sb.append(" The list of the personalies in jumping : " + getPersonalDetailsByJumping() + '\n');
        sb.append(" The list of the teams in running : " + getPersonalDetailsByRunning() + "\n\n\n");

        sb.append("The teams winners in running:  " + getWinnersInOlympicsByTeamCompetitionsByRunning() + "\n");
        sb.append("The teams winners in jumping:  " + getWinnersInOlympicsByTeamCompetitionsByJumping() + "\n");
        sb.append("The personality winners in running:  " + getWinnersInOlympicsByPersonalCompetitionsInRunning() + "\n");
        sb.append("The personality winners in jumping:  " + getWinnersInOlympicsByTeamCompetitionsByJumping() + "\n");
        sb.append("The countries winners:  " + getWinnersInOlympicsByCountriesCompetitions() + "\n");
        return sb.toString();
    }
}