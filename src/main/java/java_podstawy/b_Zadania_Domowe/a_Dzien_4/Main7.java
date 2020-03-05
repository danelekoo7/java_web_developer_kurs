package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws IOException {
        System.out.println("czy plik istnieje? " + rewrite());
    }

    static boolean rewrite() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku:");
        String nameOne = scan.nextLine();
        String nameTwo = nameOne + "_2";
        Path pathOne = Paths.get(nameOne + ".txt");
        Path pathTwo = Paths.get(nameTwo + ".txt");
        boolean result = false;
        if (Files.exists(pathOne)) {
            Files.copy(pathOne, pathTwo);
            File file = new File(pathOne.toString());
            List<String> outlist = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    outlist.add(scanner.nextLine());
                }
            }
            Files.write(pathTwo, outlist);
            result = true;
        } else {
            result = false;
            System.out.println("nie ma takiego pliku");
        }
        return result;
    }
}
