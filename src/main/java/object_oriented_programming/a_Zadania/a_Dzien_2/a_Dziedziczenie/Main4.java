package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main4 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Dan", "jed", 10);
        employee.raiseWage(-5);
        System.out.println(employee.wage);
    }
}
