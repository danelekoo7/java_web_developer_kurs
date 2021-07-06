package java_podstawy.a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text1.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String reading = scan.nextLine();
            if (reading.toLowerCase().contains("javy")) {
                System.out.println(reading);
            }
        }
    }
}