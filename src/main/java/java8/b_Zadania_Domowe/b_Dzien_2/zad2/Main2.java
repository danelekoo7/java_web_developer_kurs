package java8.b_Zadania_Domowe.b_Dzien_2.zad2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main2 {
    private static List<String> list;
    private static Predicate filter;

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny brzydki napis, który na końcu ma a");

//        obiekty których długość jest większa niż 4
        System.out.println("obiekty których długość jest większa niż 4");
        Predicate<String> longerThen4 = s -> s.length() > 4;
        System.out.println(filterList(list, longerThen4));


//        obiekty zawierające literę „b”
        System.out.println("\nobiekty zawierające literę „b”");
        Predicate<String> containsB = s -> s.contains("b");
        System.out.println(filterList(list, containsB));


        //        obiekty które kończą się na literę „a”
        System.out.println("\nobiekty które kończą się na literę „a”");
        Predicate<String> aAtTheEnd = s -> s.endsWith("a");
        System.out.println(filterList(list, aAtTheEnd));

    }

     static List<String> filterList(List<String> list, Predicate filter) {
         return (List<String>) list.stream()
                .filter(filter)
                .map(o -> o.toString())
                .collect(Collectors.toList());
    }

}
