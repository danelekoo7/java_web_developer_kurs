package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;

import object_oriented_programming.a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    public double pow(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        super.addToHistoryAndRewriteExisting(base + " ^ " + exponent + " equals " + result);
        super.addToGlobalHistoryAndRewriteExisting(base + " ^ " + exponent + " equals " + result);
        return result;
    }

    public double root(int a, int n) {
        double xPre = Math.random() % 10;
        double eps = 0.001;
        double delX = Integer.MAX_VALUE;
        double result = 0.0;
        while (delX > eps) {
            result = ((n - 1.0) * xPre + (double) a / Math.pow(xPre, n - 1)) / (double) n;
            delX = Math.abs(result - xPre);
            xPre = result;
        }
        result = Math.round(result);
        addToHistoryAndRewriteExisting(n + " root of " + a + " equals " + result);
        addToGlobalHistoryAndRewriteExisting(n + " root of " + a + " equals " + result);
        return result;
    }


    public double root2(int a, int b) {
        double min = -999999999;
        double max = 999999999;
        double number = 0;
        boolean loop = true;
        double power = 0;
        while (loop) {
            number = ((max - min) / 2) + min;
            power = pow(number, b);
            power = Math.round(power * 100000000000000.0) / 100000000000000.0;
            if (power > a) {
                max = number;
            } else if (power < a) {
                min = number;
            } else {
                number = Math.round(number * 1000000000000.0) / 1000000000000.0;
                System.out.println(number);
                loop = false;
            }
        }
        return number;
    }
}

