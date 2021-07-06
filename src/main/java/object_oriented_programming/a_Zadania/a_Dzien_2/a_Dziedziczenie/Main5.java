package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main5 {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(5, "s", "a", 20);
        System.out.println(hourlyEmployee.calculatePayment(168));
    }
}
