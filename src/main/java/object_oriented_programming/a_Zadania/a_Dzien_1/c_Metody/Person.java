package object_oriented_programming.a_Zadania.a_Dzien_1.c_Metody;

public class Person {

    private String name = "Dan";
    private String surname = "jed";
    private int age = 27;
    private String gender = "male";


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public void increaseAge() {
        this.age++;
    }
}


