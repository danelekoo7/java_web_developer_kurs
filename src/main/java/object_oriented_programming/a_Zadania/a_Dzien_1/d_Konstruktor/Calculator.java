package object_oriented_programming.a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {
    private String[] history;
    public static String[] globalHistory = new String[0];

    public Calculator() {
        this.history = new String[0];
    }

    public static final double PI = 3.14159265;

    public static double computeCircleArea(double r) {
        double result = PI * Math.pow(r, 2);
        addToGlobalHistoryAndRewriteExisting("circle area of radius " + r + " equals " + result);
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        addToHistoryAndRewriteExisting("added " + a + " to " + b + " got " + result);
        addToGlobalHistoryAndRewriteExisting("added " + a + " to " + b + " got " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        addToHistoryAndRewriteExisting("multiplied " + a + " with " + b + " got " + result);
        addToGlobalHistoryAndRewriteExisting("multiplied " + a + " with " + b + " got " + result);
        return result;
    }

    public double substract(double a, double b) {
        double result = a - b;
        addToHistoryAndRewriteExisting("subtracted " + a + " from " + b + " got " + result);
        addToGlobalHistoryAndRewriteExisting("subtracted " + a + " from " + b + " got " + result);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        addToHistoryAndRewriteExisting("divided " + a + " by " + b + " got " + result);
        addToGlobalHistoryAndRewriteExisting("divided " + a + " by " + b + " got " + result);
        return result;
    }

    public void printOperations() {
        for (int i = 0; i < this.history.length; i++) {
            System.out.println(this.history[i]);
        }
    }

    public static void printGlobalOperations() {
        for (int i = 0; i < globalHistory.length; i++) {
            System.out.println(globalHistory[i]);
        }
    }


    public static void printGlobalOperations(int length) {
        if (length <= globalHistory.length) {
            for (int i = globalHistory.length - length; i < globalHistory.length; i++) {
                System.out.println(globalHistory[i]);
            }
        }
    }

    public static void printGlobalOperations(String length) {
        int a = 0;
        try {
            a = Integer.parseInt(length);
        } catch (NumberFormatException e) {
            System.out.println("podaj liczbe");
        }
        if (a <= globalHistory.length) {
            for (int i = globalHistory.length - a; i < globalHistory.length; i++) {
                System.out.println(globalHistory[i]);
            }
        } else {
            for (int i = 0; i < globalHistory.length; i++) {
                System.out.println(globalHistory[i]);
            }
        }
    }


    public void clearOperations() {
        this.history = new String[0];
    }

    public void addToHistoryAndRewriteExisting(String newHistoryRow) {
        String[] newTab = Arrays.copyOf(this.history, this.history.length + 1);
        newTab[newTab.length - 1] = newHistoryRow;
        this.history = newTab;
    }

    public static void addToGlobalHistoryAndRewriteExisting(String newHistoryRow) {
        String[] newTab = Arrays.copyOf(globalHistory, globalHistory.length + 1);
        newTab[newTab.length - 1] = newHistoryRow;
        globalHistory = newTab;
    }


}