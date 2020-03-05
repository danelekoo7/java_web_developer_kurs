package java_podstawy.a_Zadania.e_Dzien_5.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        create(20);
    }

    static void create(int max) {
        int n = 0;
        System.out.println("podaj ilość osób w grupie");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("nie podałeś liczby");
            scanner = new Scanner(System.in);
        }
        n = scanner.nextInt();
        Scanner scanLogin = new Scanner(System.in);
        Scanner scanPoints = new Scanner(System.in);
        String[] logins = new String[n];
        int[] points = new int[n];
        int a = -1;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj login: ");
            logins[i] = scanLogin.nextLine();
            System.out.println("Podaj ilość punktów: ");
            boolean loop = true;
            while (loop) {
                if (!scanPoints.hasNextInt()) {
                    System.out.println("nie podałeś liczby");
                    scanPoints = new Scanner(System.in);
                } else if (scanPoints.hasNextInt()) {
                    a = scanPoints.nextInt();
                    if (a < 0 | a > max) {
                        System.out.println("nieprawdiłowa ilość punktów");
                        scanPoints = new Scanner(System.in);
                    } else {
                        loop = false;
                    }
                }
            }
            points[i] = a;
        }

        Path path = Paths.get("exam.txt");
        List<String> outList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            outList.add(logins[i] + " " + points[i]);
        }
        try {
            Files.write(path, outList);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }
        Path examPassed = Paths.get("exam_passed.txt");
        List<String> outListPassed = new ArrayList<>();
        File file = new File("exam.txt");
        String passed = "";
        String[] passedArray = new String[2];
        double minPoints = 0.6 * max;
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                passed = scan.nextLine();
                passedArray = passed.split(" ");
                if (Double.parseDouble(passedArray[1]) > minPoints) {
                    outListPassed.add(passed);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        try {
            Files.write(examPassed, outListPassed);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }
    }
}
