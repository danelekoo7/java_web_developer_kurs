package java_podstawy.a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class Main2 {

    public static void main(String[] args) throws IOException {
        createFile("a.txt");
    }

    static void createFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        boolean fielExist = Files.exists(path);
        if (fielExist) {
            throw new FileAlreadyExistsException(fileName);
        }
        Files.createFile(path);
    }
}
