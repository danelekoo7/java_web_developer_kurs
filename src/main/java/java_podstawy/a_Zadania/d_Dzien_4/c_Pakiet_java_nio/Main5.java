package java_podstawy.a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) throws IOException {
        readFromFile("main5.txt");
    }

    static void readFromFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        boolean fielExist = Files.exists(path);
        if (fielExist) {
            Path newPath = Paths.get(fileName + ".html");
            Files.createFile(newPath);
            File file = new File(fileName);
            List<String> outList = new ArrayList<>();
            outList.add("<html>");
            outList.add("<body>");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String napis = scanner.nextLine();
                outList.add("<p>" + napis + "</p>");
            }
            outList.add("</body>");
            outList.add("</html>");
            Files.write(newPath, outList);
        }
    }
}