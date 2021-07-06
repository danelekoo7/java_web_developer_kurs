package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        textLines();
    }

    static void textLines() {
        Scanner scanner = new Scanner(System.in);
        String scanned = "";
        while (scanned.equals("quit") == false) {
            System.out.println(scanned);
            System.out.println("Podaj wyraz");
            scanned = scanner.nextLine();
        }
    }
}