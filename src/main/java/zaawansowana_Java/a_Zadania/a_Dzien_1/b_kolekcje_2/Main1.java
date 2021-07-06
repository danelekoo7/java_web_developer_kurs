package zaawansowana_Java.a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Set<String> strings = new HashSet<>();
        int count = 0;
        System.out.println("podaj pierwszy napis");
        while (!scanner.hasNext("exit")) {
            System.out.println("podaj kolejny napis");
            strings.add(scanner.next());
            count++;
        }

        System.out.println("Podanych napisów: " + count + ", Rozmiar kolekcji: " + strings.size());
        System.out.println(strings);
    }

}
