package zaawansowana_Java.a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("exit")) {
            System.out.println(verifyEmail(scanner.next()));
        }
    }

    static boolean verifyEmail(String email) {
        return email.matches("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
    }
}
