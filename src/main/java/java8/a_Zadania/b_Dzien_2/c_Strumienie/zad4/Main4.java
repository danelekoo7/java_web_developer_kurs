package java8.a_Zadania.b_Dzien_2.c_Strumienie.zad4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {

        List<String> animals = Arrays.asList("anakonda", "zyrafa", "slon", "hipek", "chomik", "pies", "kotek", "borsuc");
//        List<String> animals = Arrays.asList("a", "z", "s", "h", "c", "p", "k", "b","CCcc");

        System.out.println("wypisze na konsoli długości elementów listy\n");
        animals.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("zwróci listę posortowaną alfabetycznie\n");
        List<String> sortedAnimalsList = animals.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedAnimalsList);

        System.out.println("wypisze na konsoli elementy, które zawierają literę „c”  \n");
        animals.stream()
                .filter(s -> s.contains("c"))
                .forEach(System.out::println);

        System.out.println("zwróci sumę długości wszystkich elementów");
        int sum = animals.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);

        System.out.println("zwróci 3 pierwsze elementy posortowane alfabetycznie");
        List<String> collect = animals.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}