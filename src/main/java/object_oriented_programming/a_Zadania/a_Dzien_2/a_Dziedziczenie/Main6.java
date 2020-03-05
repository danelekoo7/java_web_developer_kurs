package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main6 {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(1, "a", "b", 20);
        System.out.println(salariedEmployee.calculatePayment());
    }
}
