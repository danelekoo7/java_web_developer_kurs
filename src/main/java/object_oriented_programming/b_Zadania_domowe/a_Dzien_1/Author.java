package object_oriented_programming.b_Zadania_domowe.a_Dzien_1;


public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    protected Author(int id, String firstName, String lastName, String pseudonym) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }

    public String toString() {
        return this.id + " " + firstName + " " + lastName + " " + pseudonym;
    }
}
