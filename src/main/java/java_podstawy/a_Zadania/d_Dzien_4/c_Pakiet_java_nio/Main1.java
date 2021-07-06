package java_podstawy.a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) throws IOException {
        createDirectory("a");
    }

    static void createDirectory(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        boolean dirExist = Files.exists(path);
        if (dirExist) {
            throw new FileAlreadyExistsException(fileName);
        }
        Files.createDirectory(path);
    }
}


