package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee {
    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public final static double HOW_MANY_HOURS = 190;

    public double calculatePayment(){
        return this.wage*HOW_MANY_HOURS;
    }
}
