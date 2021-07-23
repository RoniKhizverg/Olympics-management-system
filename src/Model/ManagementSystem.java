package Model;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementSystem {
    private Olympics olympics, fileOlympic;
    private int numOfCompetitions;
    private int numOfTeams;
    private File f = new File("data.txt");
    private File stadiumF = new File("stadiums.txt");
    Scanner scan2 = new Scanner(stadiumF);
    Scanner scan = new Scanner(f);

    public ManagementSystem(String olympicLocation, Date startDate, Date endDate) throws Exception {
        this.olympics = new Olympics(olympicLocation, startDate, endDate);
        this.fileOlympic = new Olympics(olympicLocation, startDate, endDate);
        fileOlympic.informationDataFromFile(scan);
        numOfCompetitions = 0;
        numOfTeams = 0;
    }

    public ManagementSystem() throws Exception {
        this.olympics = new Olympics();
        this.fileOlympic = new Olympics();
        olympics.getStadiumsFromFile(scan2);
        fileOlympic.informationDataFromFile(scan);
        numOfCompetitions = 0;
        numOfTeams = 0;
    }


    public void updateOlympicName(String name) {
        olympics.setOlympicLocation(name);

    }

    public List<Stadium> showAllStadiums() {
        return olympics.getAllStadiums();
    }

    public List<Country> updateExistCountries() {
        return fileOlympic.getCountries();
    }

    public void checkDates(Date date, Date endDate) throws Exception {
        olympics.checkDates(date, endDate);
    }

    public void updateStartDate(Date date) {
        olympics.setStartDate(date);
    }

    public void updateEndDate(Date date) {
        olympics.setEndDate(date);
    }


    public String getInfoCompetitions() {
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < olympics.getCompetitions().size(); i++) {
            sf.append(i + 1 + ") " + olympics.getCompetitions().get(i));
        }
        return sf.toString();
    }

    public void updateCountries() throws Exception {
        int i, a;
        boolean isSame = true;
        int numOfCountry = 0;
        updateExistCountries();
        for (int j = 0; j < olympics.getAllTeams().size(); j++) {                 //in teams
            isSame = false;
            for (i = 0; i < fileOlympic.getCountries().size() - 1; i++) {
                if (olympics.getAllTeams().get(j).getFromCountry().equalsIgnoreCase(fileOlympic.getCountries().get(i).getCountryName())) {   //check if we have the country
                    isSame = false;
                    break;
                }
            }
            for (int b = 0; b < olympics.getCountries().size(); b++) {
                if (olympics.getCountries().get(b).getCountryName().equalsIgnoreCase(fileOlympic.getCountries().get(i).getCountryName())) {  //check that we have no yet this country in our list
                    isSame = true;
                }
            }

            if (!isSame) {                                                   //if false clear the data in fileOlympic and add country and
                fileOlympic.getCountries().get(i).getCountryTeams().clear();
                fileOlympic.getCountries().get(i).getAllAthletes().clear();
                olympics.getCountries().add(fileOlympic.getCountries().get(i));
            }
            String fromTeam = olympics.getAllTeams().get(j).getFromCountry();
            for (int c = 0; c < olympics.getCountries().size(); c++) {
                if (olympics.getCountries().get(c).getCountryName().equalsIgnoreCase(fromTeam)) {
                    olympics.getCountries().get(c).addTeams(olympics.getAllTeams().get(j));
                }
            }
        }
        for (int k = 0; k < olympics.getAllAthletes().size(); k++) {                     //now the same in athletes.....
            isSame = false;
            for (a = 0; a < fileOlympic.getCountries().size() - 1; a++) {
                if (olympics.getAllAthletes().get(k).getFromCountry().equalsIgnoreCase(fileOlympic.getCountries().get(a).getCountryName())) {
                    isSame = false;
                    break;
                }
            }
            for (int b = 0; b < olympics.getCountries().size(); b++) {
                if (olympics.getCountries().get(b).getCountryName().equalsIgnoreCase(fileOlympic.getCountries().get(a).getCountryName())) {
                    isSame = true;
                }
            }
            if (!isSame) {
                fileOlympic.getCountries().get(a).getCountryTeams().clear();
                fileOlympic.getCountries().get(a).getAllAthletes().clear();
                olympics.getCountries().add(fileOlympic.getCountries().get(a));
            }
            String fromAthlete = olympics.getAllAthletes().get(k).getFromCountry();
            for (int c = 0; c < olympics.getCountries().size(); c++) {
                if (olympics.getCountries().get(c).getCountryName().equalsIgnoreCase(fromAthlete)) {
                    olympics.getCountries().get(c).addAthlete(olympics.getAllAthletes().get(k));
                }
            }
        }
        if (olympics.getCountries().size() < 3) {
            olympics.getCountries().clear();
            throw new Exception("Must have at least 3 countries in your olympic!!!");
        }
        olympics.getWinnersInOlympicsByCountriesCompetitions();

    }


    public String displayPersonalCompetitions() {
        return olympics.getInfoPersonalCompetitions();
    }

    public String displayTeamCompetitions() {
        return olympics.getInfoTeamCompetitions();
    }

    public void buildPersonalCompetition(Stadium stadium, int index, Team.
            eSportTypes sportTypes, Date startDate) throws Exception {
        PersonalCompetition competition = new PersonalCompetition(fileOlympic.getAllReferees().get(index - 1), sportTypes, startDate, stadium);
        olympics.getCompetitions().add(competition);
        numOfCompetitions++;
    }

    public List<Athlete> showAllAthletesInFile() {
        return fileOlympic.getAllAthletes();
    }

    public List<Athlete> showUpdateAthlete() {
        return olympics.getAllAthletes();
    }

    public List<Team> showUpdateTeams() {
        return olympics.getAllTeams();
    }

    public void buildTeamCompetition(Stadium stadium, int index, Team.
            eSportTypes sportTypes, Date startDate) throws Exception {
        TeamCompetition competition = new TeamCompetition(fileOlympic.getAllReferees().get(index - 1), sportTypes, startDate, stadium);
        olympics.getAllReferees().add(fileOlympic.getAllReferees().get(index - 1));
        olympics.getCompetitions().add(competition);
    }

    public void addNewTeam(String teamName, Team.eSportTypes sportTypes, String[] numOfAthletes, Country Country) throws
            Exception {
        Team team = new Team(teamName, sportTypes, Country.getCountryName());
        for (int i = 0; i < numOfAthletes.length; i++) {
            int athleteNumber = Integer.parseInt(numOfAthletes[i]) - 1;
            if (athleteNumber >= fileOlympic.getAllAthletes().size()) {
                throw new Exception("This athlete number does not exist");
            } else {
                team.addAthlete(fileOlympic.getAllAthletes().get(athleteNumber));
            }
        }
        olympics.getAllTeams().add(team);
        numOfTeams++;
    }

    public List<Referee> showReferees() {
        return fileOlympic.getAllReferees();
    }


    public void getWinnersInCompetition(Competition competition) throws Exception {
        if (competition instanceof PersonalCompetition) {
            if (((PersonalCompetition) competition).getWinners().size() != 0) {
                throw new Exception("You have  already winners!!!");
            }
            if (((PersonalCompetition) competition).getPersonalCompetitionAthletes().size() >= 3) {
                ((PersonalCompetition) competition).getWinnersInCompetition();
            } else {
                throw new Exception("You must to have at least 3 members");
            }
        }
        if (competition instanceof TeamCompetition) {
            if (((TeamCompetition) competition).getTeamsWinners().size() != 0) {
                throw new Exception("You have  already winners!!!");
            } else if (((TeamCompetition) competition).getCompetitionTeams().size() >= 3) {
                ((TeamCompetition) competition).getWinnersInTeams();
            } else {
                throw new Exception("You must to have at least 3 members");
            }

        }
    }

    public void updateCompetitionAuto() throws Exception {                                                                    //for autoOlympic
        List<Competition> competitions = new ArrayList<Competition>();
        int randomReferee;
        boolean isFound = false;
        Stadium CampNou = new Stadium("Camp Nou", "Barcelona", 99354);
        Stadium EstadioSantiagoBernabeu = new Stadium("Estadio Santiago Bernabeu", "Madrid", 85454);
        Stadium EstadioMetropolitano = new Stadium("Estadio Metropolitano", "Madrid", 68456);
        Stadium EstadioBenitoVillamarin = new Stadium("Estadio Benito Villamarin", "Madrid", 60724);


        do {
            randomReferee = (int) (Math.random() * fileOlympic.getAllReferees().size()); // a random way
            if (fileOlympic.getAllReferees().get(randomReferee) instanceof JumpingReferee) {
                competitions.add(new TeamCompetition(fileOlympic.getAllReferees().get(randomReferee), Team.eSportTypes.JUMPING,
                        new Date(2, 12, 2020), CampNou));
                isFound = true;
            }
        } while (!isFound);
        do {
            isFound = false;
            randomReferee = (int) (Math.random() * fileOlympic.getAllReferees().size()); // a random way
            if (fileOlympic.getAllReferees().get(randomReferee) instanceof RunnerReferee) {
                competitions.add(new TeamCompetition(fileOlympic.getAllReferees().get(randomReferee), Team.eSportTypes.RUNNING,
                        new Date(2, 12, 2020), EstadioSantiagoBernabeu));
                isFound = true;
            }
        } while (!isFound);
        do {
            isFound = false;
            randomReferee = (int) (Math.random() * fileOlympic.getAllReferees().size()); // a random way
            if (fileOlympic.getAllReferees().get(randomReferee) instanceof RunnerReferee) {
                competitions.add(new PersonalCompetition(fileOlympic.getAllReferees().get(randomReferee),
                        Team.eSportTypes.RUNNING, new Date(3, 12, 2020), EstadioMetropolitano));
                isFound = true;
            }
        } while (!isFound);
        do {
            isFound = false;
            randomReferee = (int) (Math.random() * fileOlympic.getAllReferees().size()); // a random way
            if (fileOlympic.getAllReferees().get(randomReferee) instanceof JumpingReferee) {
                competitions.add(new PersonalCompetition(fileOlympic.getAllReferees().get(randomReferee),
                        Team.eSportTypes.JUMPING, new Date(4, 12, 2020), EstadioBenitoVillamarin));
                isFound = true;
            }
        } while (!isFound);
        for (int i = 0; i < competitions.size(); i++) {
            fileOlympic.addCompetitons(competitions.get(i));
        }


        for (int a = 0; a < fileOlympic.getCompetitions().size(); a++) {
            if (fileOlympic.getCompetitions().get(a) instanceof TeamCompetition) {
                for (int j = 0; j < fileOlympic.getAllTeams().size(); j++) {
                    if (fileOlympic.getAllTeams().get(j).getSportTypes() == fileOlympic.getCompetitions().get(a).getSportTypes()) {
                        ((TeamCompetition) fileOlympic.getCompetitions().get(a))
                                .addTeamsToCompetition(fileOlympic.getAllTeams().get(j));
                    }
                }

            } else if (fileOlympic.getCompetitions().get(a) instanceof PersonalCompetition) {
                for (int j = 0; j < fileOlympic.getAllAthletes().size(); j++) {
                    if (fileOlympic.getCompetitions().get(a).getSportTypes() == Team.eSportTypes.RUNNING) {
                        if ((fileOlympic.getAllAthletes().get(j) instanceof Runner) || (fileOlympic.getAllAthletes().get(j) instanceof RunnerAndJumper)) {
                            ((PersonalCompetition) fileOlympic.getCompetitions().get(a))
                                    .addAthleteToPersonalCompetition(fileOlympic.getAllAthletes().get(j));
                        }
                    } else {
                        if ((fileOlympic.getAllAthletes().get(j) instanceof Jumper) || (fileOlympic.getAllAthletes().get(j) instanceof RunnerAndJumper))

                            ((PersonalCompetition) fileOlympic.getCompetitions().get(a))
                                    .addAthleteToPersonalCompetition(fileOlympic.getAllAthletes().get(j));
                    }
                }

            }
        }

    }

    public void addAthleteToPersonalCompetition(String[] numOfAthletes, int indexCompetition) throws Exception {
        for (int i = 0; i < numOfAthletes.length; i++) {
            int athleteNumber = Integer.parseInt(numOfAthletes[i]);
            if (athleteNumber >= fileOlympic.getAllAthletes().size()) {
                throw new Exception("This number does not exist");
            }
            ((PersonalCompetition) olympics.getCompetitions().get(indexCompetition - 1)).addAthleteToPersonalCompetition(fileOlympic.getAllAthletes().get(athleteNumber - 1));
            olympics.getAllAthletes().add(fileOlympic.getAllAthletes().get(athleteNumber - 1));
        }

    }

    public void addTeamToTeamCompetition(int competitionIndex, String[] numOfTeams) throws Exception {
        for (int i = 0; i < numOfTeams.length; i++) {
            int teamNumber = Integer.parseInt(numOfTeams[i]) - 1;
            if (teamNumber >= fileOlympic.getAllTeams().size()) {
                throw new Exception("This team number does not exist");
            }
            ((TeamCompetition) olympics.getCompetitions().get(competitionIndex - 1)).addTeamsToCompetition(olympics.getAllTeams().get(teamNumber));
        }

    }


    public Olympics getOlympics() {
        return olympics;
    }


    public Olympics getFileOlympic() {
        return fileOlympic;
    }

}


