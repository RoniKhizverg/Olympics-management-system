package Olympic;

import personalities.Runner;

public class Main {
    public static void main(String[] args) throws Exception {
        Runner r = new Runner("c", 23, "b", "q", 2, "Runners");
        Runner w = new Runner("a", 23, "b", "q", 2, "Runners");
        Runner a = new Runner("b", 23, "b", "q", 2, "Runners");
        Runner z = new Runner("1", 23, "b", "q", 2, "Runners");

        Stadium s = new Stadium("a", "B", 200);
        PersonalCompetition ps = new PersonalCompetition( s, 10, r);
        ps.addAthlete(r);

    }
}
