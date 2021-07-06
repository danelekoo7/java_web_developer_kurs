package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    protected double wage;
    double percent = 0;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public void raiseWage(double percent) {
        if (percent >= 0) {
            this.wage = this.wage + (this.wage * percent * 0.01);
        }
    }
}
