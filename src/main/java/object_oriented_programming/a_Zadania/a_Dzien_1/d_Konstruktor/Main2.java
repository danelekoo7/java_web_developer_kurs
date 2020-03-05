package object_oriented_programming.a_Zadania.a_Dzien_1.d_Konstruktor;

public class Main2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.substract(5,6);
        calculator.divide(8,6);
        calculator.multiply(2,6);
        calculator.printOperations();
        calculator.clearOperations();
        calculator.printOperations();
    }
}
