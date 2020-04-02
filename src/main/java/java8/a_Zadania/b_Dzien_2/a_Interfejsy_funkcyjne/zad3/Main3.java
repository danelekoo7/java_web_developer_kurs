package java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad3;


import java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad1.Filter;
import java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad1.IntegerFilter;
import java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad2.IntegerTransform;
import java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad2.Transform;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 25, 25, 27);
        Filter<Integer> filter = new IntegerFilter();
        Transform<Integer, Integer> transform = new IntegerTransform();

//        System.out.println(create(integers, f -> f < 20, tr -> --tr));

        System.out.println(create(integers,filter ,transform ));
    }

    static <T, S> List<T> create(List<S> list, Filter<S> filter, Transform<T, S> transform){

        List<T> myList = new ArrayList<>();
        for (S listElement : list) {
            if (filter.check(listElement)) {
                myList.add(transform.transform(listElement));
            }
        }
        return myList;
    }
}