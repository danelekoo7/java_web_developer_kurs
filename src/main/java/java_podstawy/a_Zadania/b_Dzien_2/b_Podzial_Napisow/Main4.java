package java_podstawy.a_Zadania.b_Dzien_2.b_Podzial_Napisow;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) {
        String str = "Java-zadania-podzial-napisow";
        char sep = '-';
        String[] wynik = onlyTwoElements(str, sep);
        System.out.println("Pierwszy element to: " + wynik[0] + "\n " + "drugi element to: " + wynik[1]);
    }

    static String[] onlyTwoElements(String str, char separator) {
        char[] temp = str.toCharArray();
        int counter = temp.length;
        for (int i = 0; i < counter; i++) {
            if (temp[i] == separator) {
                counter = i;
            }
        }
        String textA = str.substring(0, counter);
        String textB = str.substring(counter + 1, temp.length);
        String[] result = {textA, textB};
        return result;
    }
}