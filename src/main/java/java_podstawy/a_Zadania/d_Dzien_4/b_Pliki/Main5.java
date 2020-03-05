package java_podstawy.a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text2.txt");
        Scanner scan = new Scanner(file);
        String[] tab = new String[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scan.nextLine();
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
}