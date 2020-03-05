package zaawansowana_Java.a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("podaj hasło do sprawdzenie");
        final Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("exit")) {
            System.out.println(verifyPassword(scanner.next()));
        }
    }

    static boolean verifyPassword(String password) {
        final boolean validlength = verifyLength(password);
        final boolean validLowerCase = verifyLowerCase(password);
        final boolean validUpperCase = verifyUpperCase(password);
        final boolean validCase = verifyCase(password);

        boolean result = validlength && validLowerCase && validUpperCase && validCase;
        return result;
    }

    private static boolean verifyLength(final String password) {
        return password.matches(".{10,15}");
    }

    private static boolean verifyLowerCase(final String password) {
        return password.matches(".*[a-z]+.*");
    }

    private static boolean verifyUpperCase(final String password) {
        return password.matches(".*[A-Z]+.*");
    }

    private static boolean verifyCase(final String password) {
        Pattern compiledPattern = Pattern.compile("[a-z]{2,}|[A-Z]{2,}");
        Matcher matcher = compiledPattern.matcher(password);
        return !matcher.find();
    }

}
