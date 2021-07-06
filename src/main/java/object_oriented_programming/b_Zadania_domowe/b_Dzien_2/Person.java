package object_oriented_programming.b_Zadania_domowe.b_Dzien_2;


public class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.id + " " + this.firstName + " " + this.lastName;
    }
}