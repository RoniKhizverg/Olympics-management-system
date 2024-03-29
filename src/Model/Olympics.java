package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;


public class Olympics {
    private String olympicLocation;
    private List<Competition> competitions;
    private List<Country> allCountries;
    private List<Athlete> allAthletes;
    private List<Team> allTeams;
    private List<Referee> allReferees;
    private Date endDate;
    private Date startDate;
    private List<Stadium> allStadiums;


    public Olympics(String olympicLocation, Date startDate, Date endDate) {
        this.olympicLocation = olympicLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.competitions = new ArrayList<Competition>();
        this.allCountries = new ArrayList<Country>();
        this.allAthletes = new ArrayList<Athlete>();
        this.allTeams = new ArrayList<Team>();
        this.allReferees = new ArrayList<Referee>();
    }

    public Olympics() {
        this.competitions = new ArrayList<Competition>();
        this.allCountries = new ArrayList<Country>();
        this.allAthletes = new ArrayList<Athlete>();
        this.allTeams = new ArrayList<Team>();
        this.allReferees = new ArrayList<Referee>();
        this.allStadiums = new ArrayList<Stadium>();
    }

    public boolean checkDates(Date startDate, Date endDate) throws Exception {
        if (startDate.getYear() > endDate.getYear()) {
            throw new Exception("Invalid date");
        } else if (startDate.getYear() == endDate.getYear()) {
            if (startDate.getMonth() > endDate.getMonth()) {
                throw new Exception("Invalid date");
            } else if (startDate.getMonth() == endDate.getMonth()) {
                if (startDate.getDay() > endDate.getDay()) {
                    throw new Exception("Invalid date");
                }
            }
        }
        return true;
    }

    public void getStadiumsFromFile(Scanner scanner) {
        while (scanner.hasNext()) {
            String name = scanner.next();
            name += scanner.nextLine();
            String address = scanner.next();
            address += scanner.nextLine();
            int numOfSeats = Integer.parseInt((scanner.nextLine()));
            Stadium stadium = new Stadium(name, address, numOfSeats);
            allStadiums.add(stadium);
        }

    }

    public List<Stadium> getAllStadiums() {
        return allStadiums;
    }

    public void addCompetitons(Competition newCompetition) {
        competitions.add(newCompetition);
    }

    public void informationDataFromFile(Scanner sFile) throws Exception {
        int numOfCountries = 0;
        int numOfTeams = 0;
        while (sFile.hasNext()) {
            while (sFile.hasNext()) {
                String countryName = sFile.nextLine();
                if (countryName.equals("")) {
                    break;
                }
                String anthem = sFile.next();
                anthem += sFile.nextLine();
                Country newCountry = new Country(countryName, anthem);
                allCountries.add(newCountry);
            }
            while (sFile.hasNext()) {
                String athleteName = sFile.nextLine();
                if (athleteName.equals("")) {
                    break;
                }
                int age = sFile.nextInt();
                String gender = sFile.next();
                String typeSport = sFile.next();
                String fromCountry = sFile.next();
                fromCountry += sFile.nextLine();
                if (typeSport.equalsIgnoreCase("running")) {
                    int highestSpeed = sFile.nextInt();
                    Athlete newAthlete = new Runner(athleteName, age, gender, highestSpeed, fromCountry);
                    allCountries.get(numOfCountries).addAthlete(newAthlete);
                    allAthletes.add(newAthlete);
                } else if (typeSport.equalsIgnoreCase("jumping")) {
                    int highestJumping = sFile.nextInt();
                    Athlete newAthlete = new Jumper(athleteName, age, gender, highestJumping, fromCountry);
                    allCountries.get(numOfCountries).addAthlete(newAthlete);
                    allAthletes.add(newAthlete);
                } else {
                    int highestSpeed = sFile.nextInt();
                    int highestJumping = sFile.nextInt();
                    Athlete newAthlete = new RunnerAndJumper(athleteName, age, gender, highestSpeed, highestJumping, fromCountry);
                    allAthletes.add(newAthlete);
                    allCountries.get(numOfCountries).addAthlete(newAthlete);

                }
                sFile.nextLine();

            }
            String typeContest = sFile.nextLine();
            if (typeContest.equals("Team")) {
                while (sFile.hasNext()) {
                    String teamName = sFile.nextLine();
                    if (teamName.equals("")) {
                        break;
                    }
                    Team.eSportTypes sportType = Team.eSportTypes.valueOf(sFile.next().toUpperCase());
                    Team newTeam = new Team(teamName, sportType, allCountries.get(numOfCountries).getCountryName());
                    allTeams.add(newTeam);
                    allCountries.get(numOfCountries).addTeams(newTeam);
                    sFile.nextLine();
                }
                while (sFile.hasNext()) {
                    String athleteName = sFile.nextLine();
                    if (athleteName.equals("")) {
                        break;
                    }
                    int age = sFile.nextInt();
                    String gender = sFile.next();
                    String typeSport = sFile.next();
                    String fromCountry = sFile.next();
                    fromCountry += sFile.nextLine();
                    if (typeSport.equalsIgnoreCase("running")) {
                        int highestSpeed = sFile.nextInt();
                        Athlete newAthlete = new Runner(athleteName, age, gender, highestSpeed, fromCountry);
                        allTeams.get(numOfTeams).addAthlete(newAthlete);
                        allCountries.get(numOfCountries).addAthlete(newAthlete);
                        allAthletes.add(newAthlete);
                    } else if (typeSport.equalsIgnoreCase("jumping")) {
                        int highestJumping = sFile.nextInt();
                        Athlete newAthlete = new Jumper(athleteName, age, gender, highestJumping, fromCountry);
                        allCountries.get(numOfCountries).addAthlete(newAthlete);
                        allAthletes.add(newAthlete);
                        allTeams.get(numOfTeams).addAthlete(newAthlete);
                    } else {
                        int highestSpeed = sFile.nextInt();
                        int highestJumping = sFile.nextInt();
                        Athlete newAthlete = new RunnerAndJumper(athleteName, age, gender, highestSpeed,
                                highestJumping, fromCountry);
                        allCountries.get(numOfCountries).addAthlete(newAthlete);
                        allTeams.get(numOfTeams).addAthlete(newAthlete);
                        allAthletes.add(newAthlete);

                    }
                    sFile.nextLine();
                }
                numOfTeams++;
            }
            String ifReferee = "";
            if (typeContest.equals("Team")) {
                ifReferee = sFile.next();
                sFile.nextLine();
            }
            if (ifReferee.equalsIgnoreCase("reffere") || ifReferee.equals("")) {
                while (sFile.hasNext()) {
                    String refereeName = sFile.nextLine();
                    if (refereeName.equals(""))
                        break;
                    int refereeAge = sFile.nextInt();
                    String refereeGender = sFile.next();
                    int numOfExperience = sFile.nextInt();
                    String SportType = sFile.next();
                    String fromCountry = sFile.next();
                    fromCountry += sFile.nextLine();
                    if (SportType.equalsIgnoreCase("running")) {
                        int numOfRunningContestsRefereed = sFile.nextInt();
                        Referee newReferee = new RunnerReferee(refereeName, refereeAge, refereeGender, numOfExperience,
                                numOfRunningContestsRefereed, fromCountry);
                        allReferees.add(newReferee);
                    } else if (SportType.equalsIgnoreCase("jumping")) {
                        int numOfJumpingContestsRefereed = sFile.nextInt();
                        Referee newReferee = new JumpingReferee(refereeName, refereeAge, refereeGender, numOfExperience,
                                numOfJumpingContestsRefereed, fromCountry);
                        allReferees.add(newReferee);
                    }

                }
            }
            sFile.nextLine();
            numOfCountries++;
        }
    }

    public List<Referee> getAllReferees() {
        return allReferees;
    }

    public List<Athlete> getAllAthletes() {
        return allAthletes;
    }


    public List<Competition> getCompetitions() {
        return competitions;
    }

    public String getInfoTeamCompetitions() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < competitions.size(); i++) {
            if (competitions.get(i) instanceof TeamCompetition)
                sb.append(i + 1 + ") " + competitions.get(i));
        }
        return sb.toString();
    }

    public String getInfoPersonalCompetitions() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < competitions.size(); i++) {
            if (competitions.get(i) instanceof PersonalCompetition)
                sb.append(i + 1 + ") " + competitions.get(i));
        }
        return sb.toString();
    }


    public List<Team> getAllTeams() {
        return allTeams;
    }

    public void updateMdealsInCountry() {
        for (int i = 0; i < allCountries.size(); i++) {
            int numOfMedalsInCountry = 0;
            for (int j = 0; j < allCountries.get(i).getAllAthletes().size(); j++) {
                numOfMedalsInCountry += allCountries.get(i).getAllAthletes().get(j).getNumOfMedals();
            }
            for (int k = 0; k < allCountries.get(i).getCountryTeams().size(); k++) {
                numOfMedalsInCountry += allCountries.get(i).getCountryTeams().get(k).getNumOfTeamsMedals();
            }
            allCountries.get(i).setNumOfMedals(numOfMedalsInCountry);
        }
    }

    public List<Athlete> getAthletesDetailsisSorted() {

        return sortPersonalCompetition(allAthletes);
    }


    public List<Country> getCountries() {
        return allCountries;
    }

    public void sortCountriesByMedals(List<Country> allCountries) {
        // getAllCountry();
        Comparator<Country> compareByCountries = new Comparator<Country>() {
            public int compare(Country o1, Country o2) {
                if (o1.getNumOfMedals() < o2.getNumOfMedals()) {
                    return 1;
                } else if (o1.getNumOfMedals() == o2.getNumOfMedals()) {
                    return 0;
                }
                return -1;
            }
        };
        Collections.sort(allCountries, compareByCountries);

    }

    public List<Team> sortTeams(List<Team> teams) {
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
        Collections.sort(teams, compareByTeamsMedals);
        return teams;

    }


    public List<Athlete> sortPersonalCompetition(List<Athlete> athletes) {
        Comparator<Athlete> compareByMedals = new Comparator<Athlete>() {
            public int compare(Athlete o1, Athlete o2) {
                if ((o1.getNumOfMedals() < o2.getNumOfMedals())) {
                    return 1;
                } else if (o1.getNumOfMedals() == o2.getNumOfMedals()) {
                    return 0;
                }
                return -1;
            }
        };
        Collections.sort(athletes, compareByMedals);
        return athletes;
    }

    public String getWinnersInOlympicsByPersonalCompetitions() {
        sortPersonalCompetition(allAthletes);
        String personalWinners = "";
        if (allAthletes.size() >= 3) {
            for (int i = 0; i < 3; i++) {
                personalWinners += allAthletes.get(i) + "\n";
            }
        }
        return personalWinners;
    }

    public String getWinnersInOlympicsByTeamCompetitions() {
        sortTeams(allTeams);
        String teamsWinners = "";
        if (allTeams.size() >= 3) {
            for (int i = 0; i < 3; i++) {
                teamsWinners += allTeams.get(i) + "\n";
            }
        }
        return teamsWinners;
    }

    public String getOlympicLocation() {
        return olympicLocation;
    }

    public void setOlympicLocation(String olympicLocation) {
        this.olympicLocation = olympicLocation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void getWinnersInOlympicsByCountriesCompetitions() {
        updateMdealsInCountry();
        sortCountriesByMedals(allCountries);

    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Olympics" + "\n");
        for (Competition competitions : competitions) {
            if (competitions instanceof TeamCompetition) {
                ((TeamCompetition) competitions).getWinnersInTeams();
            }
            if (competitions instanceof PersonalCompetition) {
                ((PersonalCompetition) competitions).getWinners();
            }
        }

        getWinnersInOlympicsByPersonalCompetitions();
        getWinnersInOlympicsByCountriesCompetitions();
        sb.append(" The winners  in teams are:" + getWinnersInOlympicsByTeamCompetitions());

        sb.append("The winners in countries are: " + getCountries().get(0) + "\n" + getCountries().get(1) + "\n" + getCountries().get(2));
        sb.append("The winners in teams are " + getWinnersInOlympicsByTeamCompetitions());
        sb.append("The winners athlete are " + getWinnersInOlympicsByPersonalCompetitions());
        return sb.toString();

    }
}