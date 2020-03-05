package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        System.out.println("Czy dany plik istnieje? " + checkFileExist());
    }

    static boolean checkFileExist() {
        boolean result = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String name = scan.nextLine();
        Path path = Paths.get(name);
        if (Files.exists(path)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}