package zaawansowana_Java.a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    private static final String REGEX = "-?\\d+([\\\\/*+\\-]\\d+)*=-?\\d+";

    public static void main(String[] args) throws IOException {
        List<String> records = new ArrayList<>();
        System.out.println("napisz wyrazenie");
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!scanner.hasNext("quit")) {
            input = scanner.nextLine();
            final String normalisedInput = input.replaceAll("\\s", "");
            if (normalisedInput.matches(REGEX)) {
                records.add(normalisedInput);
                System.out.println(normalisedInput);
            } else {
                System.out.println("niepoprawne wyrażenie");
            }
        }
        System.out.println(records);
        writeToFile(records);
    }

    private static void writeToFile(final List<String> records) throws IOException {
        try (final FileWriter writer = new FileWriter("operations.txt")) {
            for (String str : records) {
                writer.write(str + System.lineSeparator());
            }
        }
    }
}