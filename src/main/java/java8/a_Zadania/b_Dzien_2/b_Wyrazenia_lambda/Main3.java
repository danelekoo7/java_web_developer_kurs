package java8.a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {

        print(o -> o instanceof Number, -2.1);
        print(o -> o instanceof Number, -2);
        print(o -> o instanceof Number, 1);
        print(o -> o instanceof Number, "nok");
        print(o -> o instanceof Number, "3");
        print(o -> o instanceof Number, '2');
        print(o -> o instanceof Number, 11);
    }

    static void print(Predicate predicate, Object value) {
        if (predicate.test(value)) {
            System.out.println(value);
        }
    }
}
