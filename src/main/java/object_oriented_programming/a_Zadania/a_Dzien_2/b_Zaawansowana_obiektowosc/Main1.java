package object_oriented_programming.a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import object_oriented_programming.a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;
import object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie.AdvancedCalculator;

public class Main1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        calculator.add(5,3);
        calculator.divide(2,6);
        calculator.multiply(2,6);
        advancedCalculator.pow(5,3);
        advancedCalculator.root(-27,3);
        calculator.substract(8,3);
        Calculator.computeCircleArea(2);
        Calculator.printGlobalOperations("5");
    }


}
