package java8.b_Zadania_Domowe.b_Dzien_2.zad3;

import java.util.function.Function;

public class Main3 {

    public static void main(String[] args) {
        String sample = "CODERSLAB";

        Function<String, String> sampleText = s -> s.substring(2, s.length() - 2).toLowerCase();

        System.out.println(sampleText.apply(sample));
    }
}
