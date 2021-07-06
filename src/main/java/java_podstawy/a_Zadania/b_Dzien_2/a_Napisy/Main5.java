package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
        String[] str = {"ala", "ma", "kota", "litwo", "ojczyzno", "moja"};
        String result = stringFromArray(str);
        System.out.println(result);
    }

    static String stringFromArray(String[] str) {
        String temp = "";
        for (int i = 0; i < str.length; i++) {
            temp += " " + str[i];
        }
        return temp;
    }
}
