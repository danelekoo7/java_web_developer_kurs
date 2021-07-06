package java_podstawy.a_Zadania.e_Dzien_5.exam;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println(ball());
    }

    static double ball() {
        System.out.println("podaj promien kuli");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double v = ((4 * Math.PI * (r * r * r)) / 3);
        return v;
    }
}
