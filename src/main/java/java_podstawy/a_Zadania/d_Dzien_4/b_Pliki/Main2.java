package java_podstawy.a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Main1.txt");
        StringBuilder reading = new StringBuilder();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            reading.append(scan.nextLine() + "\n");
        }
        System.out.println(reading.toString());
    }
}
