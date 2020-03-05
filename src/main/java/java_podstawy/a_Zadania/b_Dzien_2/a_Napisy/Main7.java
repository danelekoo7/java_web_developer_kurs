package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
        String str = "A to kanapa pana kota";
        String strLowerCase = str.toLowerCase();
        String strWithoutSpace = strLowerCase.replaceAll(" ", "");
        char[] strArray = strWithoutSpace.toCharArray();
        char[] reverseStr = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            reverseStr[i] = strArray[strArray.length - i - 1];
        }
        if (Arrays.equals(reverseStr, strArray)) {
            System.out.println("podane zdanie jest palindromem");
        } else {
            System.out.println("podane zdanie nie jest palindromem");
        }
    }
}
