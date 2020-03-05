package java_podstawy.a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main4 {

    public static void main(String[] args) {
        String str = "Kobyła ma mały bok";
        String strOne = StringUtils.deleteWhitespace(str);
        boolean result = 0 == StringUtils.compareIgnoreCase(strOne.toLowerCase(), StringUtils.reverse(strOne.toLowerCase()));
        System.out.println("Czy str to palindrom? " + result);
    }
}