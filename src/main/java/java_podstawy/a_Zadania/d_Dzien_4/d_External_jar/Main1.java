package java_podstawy.a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main1 {

    public static void main(String[] args) {
        String str = "Tak";
        String reverseString = StringUtils.reverse(str);
        System.out.println(reverseString);
    }
}