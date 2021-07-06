package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        nettoBrutto();
    }

    static void nettoBrutto() {
        Scanner scanner = new Scanner(System.in);
        String nbOrBn = "";
        do {
            System.out.println("Zamiana netto-brutto czy brutto-netto? Wpisz bn lub bn");
            nbOrBn = scanner.nextLine();
        }
        while (!nbOrBn.equals("nb") & !nbOrBn.equals("bn"));
        double kwota = 0;
        System.out.println("Podaj kwotę");
        kwota = scanner.nextDouble();
        if (nbOrBn.equals("nb")) {
            double result = kwota * 1.23;
            System.out.println("po przeliczeniu na brutto: " + result);
        } else if (nbOrBn.equals("bn")) {
            double result = kwota * (1 - 0.187);
            System.out.println("po przeliczeniu na brutto: " + result);
        }
    }
}