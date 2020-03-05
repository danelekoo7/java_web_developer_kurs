package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class HourlyEmployee extends Employee {
    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(double hours){
        return this.wage*hours;
    }
}
