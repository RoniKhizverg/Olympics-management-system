package Model;


public abstract class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
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


    @Override
    public String toString() {
        return  name + " , Age: " + age + ", Gender: " + gender + " ," ;

    }
}
