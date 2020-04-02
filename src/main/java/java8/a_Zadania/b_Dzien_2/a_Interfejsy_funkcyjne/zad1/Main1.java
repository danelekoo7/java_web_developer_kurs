package java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad1;

import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 25, 26, 27);

        Filter<Integer> filter = new IntegerFilter();

        Filter<Integer> filterAnonymous = new Filter<Integer>() {
            @Override
            public boolean check(Integer v) {
                return v < 20;
            }
        };

        Filter<Integer> filterLambda = zmienna -> zmienna < 20;

//        printList(integers, zmienna -> zmienna < 20);

//        printList(integers,filter);

//        printList(integers,filterLambda);

        printList(integers, filterAnonymous);
    }

    static <T> void printList(List<T> sourceList, Filter<T> filter) {
        for (T listElement : sourceList) {
            if (filter.check(listElement)) {
                System.out.println(listElement);
            }
        }
    }
}