package java_podstawy.a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(toggleChar("TaK"));
    }

    static String toggleChar(String str) {
        String swap = StringUtils.swapCase(str);
        return swap;
    }
}