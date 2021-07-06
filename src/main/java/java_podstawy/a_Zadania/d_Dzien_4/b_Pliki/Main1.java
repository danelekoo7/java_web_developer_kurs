package java_podstawy.a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter("Main1.txt");
        while (!scanner.hasNext("quit")) {
            printWriter.println(scanner.next());
        }
        printWriter.close();
    }
}