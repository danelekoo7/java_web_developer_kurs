package java_podstawy.a_Zadania.e_Dzien_5.exam;

public class Main7 {
    public static void main(String[] args) {
        String str = "PO5ZUK4J I DOD4J UKRYT3 CYFRY";
        System.out.println(countNumbers(str));
    }

    static int countNumbers(String str) {
        char[] tab = str.toCharArray();
        int number = 0;
        for (int i = 0; i < tab.length; i++) {
            if (Character.isDigit(tab[i])) {
                number += Character.getNumericValue(tab[i]);
            }
        }
        return number;
    }
}
