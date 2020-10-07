package Olympics;

public class Country {
    private String countryName;
    private String anthem;
    private int numOfMedals;

    public Country(String countryName, String anthem) {
        this.countryName = countryName;
        this.anthem = anthem;
    }
    public Country(Country other){
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

    public void setAnthem(String anthem) {
        this.anthem = anthem;
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


}
