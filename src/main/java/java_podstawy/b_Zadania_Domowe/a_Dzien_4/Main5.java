package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        printTriangle();
    }

    static void printTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}