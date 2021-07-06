package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) throws IOException {
        String fileName = "Main1.txt";
        System.out.println(count(fileName));
    }

    static int count(String fileName) throws IOException {
        int counter = 0;
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        StringBuilder text = new StringBuilder();
        while (scan.hasNextLine()) {
            text.append(scan.nextLine());
        }
        counter = text.length();
        return counter;
    }
}