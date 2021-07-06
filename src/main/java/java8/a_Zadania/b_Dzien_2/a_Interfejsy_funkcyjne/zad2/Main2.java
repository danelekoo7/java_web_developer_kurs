package java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad2;


import java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad1.Filter;
import java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad1.IntegerFilter;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 25, 25, 27);
        Filter<Integer> filter = new IntegerFilter();
        Transform<Integer, Integer> transform = new IntegerTransform();
        Transform<Integer, Integer> transform1 = new Transform<Integer, Integer>() {
            @Override
            public Integer transform(Integer integer) {
                System.out.println(integer + " transform1");
                return --integer;
            }
        };
        Transform<Integer, Integer> transformLambda = cokolwiek -> {
            System.out.println(cokolwiek + " transformLambda");
            return --cokolwiek;
        };

//        printList(integers, f -> f < 20, tr -> --tr);

//        printList(integers, filter, transform);

//        printList(integers, filter, transformLambda);

        printList(integers, filter, transform1);

    }

    static <T, S> void printList(List<S> list, Filter<S> filter, Transform<T, S> transform) {
        for (S listElement : list) {
            if (filter.check(listElement)) {
                System.out.println(transform.transform(listElement));
            }
        }
    }


}