package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        String str = "codersLabxyz";
        char[] strHelp = str.toCharArray();
        String reverse = "";
        for (int i = 0; i < strHelp.length; i++) {
            reverse += strHelp[strHelp.length - i - 1];
        }
        System.out.println(reverse);
    }
}