package personalities;

import Olympics.Country;

public abstract class Person {
    private String name;
    private int age;
    private String gender;
    private Country country;

    public Person(String name, int age, String gender, Country country) {
        this.name = name;
        setAge(age);
        this.gender = gender;
        setCountry(country);
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return " [Name: " + name + " + Age: " + age + ", Gender: " + gender + ", Country: " + country + ", ";

    }
}
