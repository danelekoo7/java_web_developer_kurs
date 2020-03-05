package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        operations();
    }

    static void operations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę ");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę :");
        double b = scanner.nextDouble();
        System.out.println("Suma to :" + (a + b));
        System.out.println("Różnica to :" + (a - b));
        System.out.println("Iloczyn to :" + (a * b));
        System.out.println("Iloraz to :" + (a / b));
    }
}