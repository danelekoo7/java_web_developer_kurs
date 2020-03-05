package java_podstawy.a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.*;

public class Main3 {

    public static void main(String[] args) throws IOException {
        copyFile("a_Zadania/a_Dzien_1/a_Schematy_blokowe", "README.md", "NEW_FILE.md");
    }

    static void copyFile(String directory, String fileName, String secondFileName) throws IOException {
        Path path = Paths.get(directory + "/" + fileName);
        boolean fileExist = Files.exists(path);
        if (!fileExist) {
            throw new FileAlreadyExistsException(fileName);
        }
        Path pathSecond = Paths.get(directory + "/" + secondFileName);
        Files.copy(path, pathSecond, StandardCopyOption.REPLACE_EXISTING);
    }
}