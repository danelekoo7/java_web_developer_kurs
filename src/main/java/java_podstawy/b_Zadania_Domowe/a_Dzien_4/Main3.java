package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String fileName = scan.nextLine();
        File file = new File(fileName);
        Scanner personalDate = new Scanner(file);
        String[] date = new String[4];
        String[] result = new String[2];
        while (personalDate.hasNextLine()) {
            String reading = personalDate.nextLine();
            date = reading.split(" ");
            if (date[3].equals("M") & Integer.parseInt(date[2]) <= 1954) {
                for (int i = 0; i < 2; i++) {
                    result[i] = date[i];
                }
                System.out.println(Arrays.toString(result));
            } else if (date[3].equals("K") & Integer.parseInt(date[2]) <= 1959) {
                for (int i = 0; i < 2; i++) {
                    result[i] = date[i];
                }
                System.out.println(Arrays.toString(result));
            }
        }
    }
}
