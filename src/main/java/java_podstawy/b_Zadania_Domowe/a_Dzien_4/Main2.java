package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Main1.txt";
        System.out.println(count(fileName));
    }

    static int count(String fileName) throws FileNotFoundException {
        int counter = 0;
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String reading = scan.nextLine();
            String[] tab = reading.split(" ");
            counter += tab.length;
        }
        return counter;
    }
}