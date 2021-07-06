package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        getData();
    }

    static void getData() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int scanned;
        do {
            System.out.println("podaj liczbę: ");
            scanned = scanner.nextInt();
            sum += scanned;
            if (scanned != 0) {
                counter++;
            }
        } while (scanned != 0);
        System.out.println("licznik " + counter);
        System.out.println("suma " + sum);
    }
}