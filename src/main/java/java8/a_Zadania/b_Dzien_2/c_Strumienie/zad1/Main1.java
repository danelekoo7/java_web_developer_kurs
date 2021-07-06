package java8.a_Zadania.b_Dzien_2.c_Strumienie.zad1;

import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = List.of("asci", "sanki", "ddd", "saska", "saska", "asasyn", "ananas", "sanki", "delfin");

//        wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające
//        się na literę „a” lub „s”, posortowane alfabetycznie

        System.out.println("zadanie 1");
        list.stream()
                .filter(input -> input.startsWith("a") || input.startsWith("s"))
                .sorted((o1, o2) -> o1.compareTo(o2))
                .map(input -> input.toUpperCase())
                .forEach(input -> System.out.println(input));

//        zwróci listę, która powstanie poprzez wybranie z listy unikalnych
//        łańcuchów o długości równej 5

        System.out.println("zadanie 2");
        List<String> collect = list.stream()
                .filter(input -> input.length() == 5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

//        utworzy obiekt typu String, zbudowany z posortowanych elementów listy
//        ograniczonych do 3 pierwszych znaków każdego elementu, oddzielonych przecinkami


        System.out.println("zadanie 3");
        String collect1 = list.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .map(s -> s.substring(0, 3))
                .collect(Collectors.joining(","));

        System.out.println(collect1);
    }
}
