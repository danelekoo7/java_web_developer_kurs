package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main6 {

    public static void main(String[] args) {
        equation();
    }

    static void equation() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("podaj a: ");
        a = scanner.nextInt();
        System.out.println("podaj b: ");
        b = scanner.nextInt();
        System.out.println("podaj c: ");
        c = scanner.nextInt();
        double delta = (b * b) - (4 * a * c);
        double sqrt = sqrt(delta);
        if (delta > 0) {
            System.out.print("pierwszy pierwiastek to :");
            System.out.println((-b - sqrt) / (2 * a));
            System.out.print("drugi pierwiastek to :");
            System.out.println((-b + sqrt) / (2 * a));
        } else if (delta == 0) {
            System.out.print("jedyny pierwiastek to :");
            System.out.println((-b) / (2 * a));
        } else {
            System.out.println("brak pierwiastków równania");
        }
    }
}