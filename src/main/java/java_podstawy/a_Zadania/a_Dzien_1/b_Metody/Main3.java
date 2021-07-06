package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    public static void main(String[] args) {
        double zl = 2;
        double result;
        result = convertToUsd(zl);
        System.out.println(result);
    }

    static double convertToUsd(double pln) {
        double result = pln * 4.04;
        return result;
    }
}