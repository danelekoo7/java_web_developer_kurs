package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        getInfo();
    }

    static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie: ");
        String imie = scanner.next();
        System.out.println("ile masz lat: ");
        int wiek = scanner.nextInt();
        System.out.println(imie + " ma " + wiek + " lat");
    }
}