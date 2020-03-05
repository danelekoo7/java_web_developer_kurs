package java_podstawy.a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) {
        String str = "   To jest              tekst do   ";
        int result = countTokens(str);
        System.out.println(result);
    }

    static int countTokens(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        int sum = 0;
        while (stringTokenizer.hasMoreTokens()) {
            stringTokenizer.nextToken();
            sum = sum + 1;
        }
        return sum;
    }
}