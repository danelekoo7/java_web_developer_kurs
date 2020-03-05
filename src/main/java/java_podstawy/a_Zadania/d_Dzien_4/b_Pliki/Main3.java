package java_podstawy.a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Main3.txt");
        Scanner scan = new Scanner(file);
        double sum = 0;
        while (scan.hasNextLine()) {
            String reading = scan.nextLine();
            String[] parts = reading.split(", ");
            for (int i = 0; i < parts.length; i++) {
                try {
                    double liczba = Double.parseDouble(parts[i]);
                    sum += liczba;
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(sum);
    }
}

