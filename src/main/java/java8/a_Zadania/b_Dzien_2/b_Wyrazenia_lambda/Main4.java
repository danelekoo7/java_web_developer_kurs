package java8.a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Function;

public class Main4 {

    public static void main(String[] args) {

        Function<Double, Double> kwadrat = (a) -> a * a;
        System.out.println(kwadrat.apply(5.0));


        Function<Double, Double> pierwiastek = (a) -> Math.sqrt(a);
        System.out.println(pierwiastek.apply(27.0));

        Function<Integer, Integer> silnia = (a) -> {
            Integer b = 1;
            for (int i = 1; i <= a; i++) {
                b = b * i;
            }
            return b;
        };
        System.out.println(silnia.apply(5));
    }
}