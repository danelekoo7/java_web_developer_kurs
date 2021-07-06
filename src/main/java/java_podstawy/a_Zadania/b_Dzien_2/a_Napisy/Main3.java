package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

public class Main3 {

    public static void main(String[] args) {
        String str = "1234567890";
        String result = firstHalf(str);
        System.out.println(result);
    }

    static String firstHalf(String str) {
        String subStr = str.substring(0, str.length() / 2);
        return subStr;
    }
}
