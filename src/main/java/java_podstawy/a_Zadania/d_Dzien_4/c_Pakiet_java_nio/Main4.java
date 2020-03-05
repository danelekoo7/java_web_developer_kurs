package java_podstawy.a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) throws IOException {
        writeToFile("main4.txt");
    }

    static void writeToFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        boolean fielExist = Files.exists(path);
        if (fielExist) {
            throw new FileAlreadyExistsException(fileName);
        }
        Files.createFile(path);
        Scanner scanner = new Scanner(System.in);
        List<String> outList = new ArrayList<>();
        System.out.println("podaj słowo: ");
        while (!scanner.hasNext("quit")) {
            System.out.println("podaj słowo: ");
            String napis = scanner.nextLine();
            outList.add(napis);
        }
        Files.write(path, outList);
    }
}