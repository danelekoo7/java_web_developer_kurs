package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

import java.sql.SQLOutput;

public class Main4 {

    public static void main(String[] args) {
        String word = "Sandomierz";
        String searchW = "do";
        boolean result = containsStr(word, searchW);
        System.out.println(result);
    }

    static boolean containsStr(String str, String search) {
        boolean searching = str.contains(search);
        return searching;
    }
}
