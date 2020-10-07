package Olympics;

import java.util.List;

public class Competition <competitionType>  {
    private competitionType type;
    private List<Country> countries;

    public void addCountry(Country c){

        for(int i=0; i < countries.size(); i++) {
            if (!c.equals(countries.get(i))) {
            }
            countries.add(c);
        }
    }

    public void add( competitionType type){
        this.type = type;
    }
    public List<Country> getCountries(){
        return countries;
    }
    public competitionType getCompetitionType() {
        return type;
    }



}
