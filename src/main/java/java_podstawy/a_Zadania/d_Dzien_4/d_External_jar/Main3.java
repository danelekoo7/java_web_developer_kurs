package java_podstawy.a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main3 {

    public static void main(String[] args) {
        String[] arrayOfString = {"cos", "sie", "dzieje"};
        System.out.println(stringFromArray(arrayOfString));
    }

    static String stringFromArray(String[] str) {
        String result = StringUtils.join(str);
        return result;
    }
}