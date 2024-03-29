package Model;


import java.util.*;


public class PersonalCompetition extends Competition implements iCompetition{
	private List<Athlete> personalCompetitionAthletes,winners;

	public PersonalCompetition(Referee referee, Team.eSportTypes sportTypes, Date startDate, Stadium stadium) throws Exception {
		super(referee, sportTypes, startDate,stadium);
		this.personalCompetitionAthletes = new ArrayList<Athlete>();
		winners = new ArrayList<Athlete>();
	}

	public List<Athlete> getPersonalCompetitionAthletes() {
		return personalCompetitionAthletes;
	}

	public boolean addAthleteToPersonalCompetition(Athlete newAthlete) throws Exception {
		for(int i=0; i<personalCompetitionAthletes.size();i++){
			if(personalCompetitionAthletes.get(i).equals(newAthlete)){
				throw new Exception("The athlete is already exist");
			}
		}
		if (getSportTypes() == Team.eSportTypes.RUNNING){
			if((newAthlete instanceof Runner) || (newAthlete instanceof RunnerAndJumper)) {
				personalCompetitionAthletes.add(newAthlete);
				return true;
			}
		}
		 else if (getSportTypes() == Team.eSportTypes.JUMPING) {
				if((newAthlete instanceof Jumper) || (newAthlete instanceof RunnerAndJumper)) {
			personalCompetitionAthletes.add(newAthlete);
			return true;
				}
		}
		 throw new Exception("You cant add this type of athlete");
}

public List<Athlete> getWinnersInCompetition() {
	int numOfWinners = 0;
	while (numOfWinners != 3) {
		int randomWinners = (int) (Math.random() * personalCompetitionAthletes.size());
		if (checkIfNoRepeatWinner(winners, personalCompetitionAthletes.get(randomWinners))) {
			winners.add(personalCompetitionAthletes.get(randomWinners));
			personalCompetitionAthletes.get(randomWinners).addNumOfMedals();
			numOfWinners++;
		}
	}
	sortByNumOfmedals();
	return winners;
}

	public List<Athlete> getWinners() {
		return winners;
	}

	public static boolean checkIfNoRepeatWinner(List<Athlete> allWinners, Athlete winner) {
	for (int i = 0; i < allWinners.size(); i++) {
		if (allWinners.get(i).equals(winner)) {
			return false;
		}
	}
	return true;

}

public void sortByNumOfmedals() {
	Comparator<Athlete> compareByMedals = new Comparator<Athlete>() {
		public int compare(Athlete o1, Athlete o2) {
			if (o1.getNumOfMedals() < o2.getNumOfMedals())
				return 1;
			else if (o1.getNumOfMedals() == o2.getNumOfMedals())
				return 0;
			return -1;
		}
	};
	Collections.sort(personalCompetitionAthletes, compareByMedals);

}

@Override
public String toString() {
	StringBuffer sb = new StringBuffer(" Personal Competition  ");
	sb.append("Num of participatants: " + personalCompetitionAthletes.size() + "\n");
	for (int i = 0; i < personalCompetitionAthletes.size(); i++) {
		sb.append(personalCompetitionAthletes.get(i) + "\n");
	}
	return  sb.toString() + super.toString();
}

	@Override
	public String getInfo() {
		return super.toString();
	}
}
