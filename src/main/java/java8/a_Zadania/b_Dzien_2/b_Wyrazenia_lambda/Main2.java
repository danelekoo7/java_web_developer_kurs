package java8.a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        print(argument -> argument instanceof String, "auto");
    }

    static void print(Predicate predicate, Object value) {
        if (predicate.test(value)) {
            System.out.println(value);
        }
    }
}
