package java8.b_Zadania_Domowe.b_Dzien_2.zad5;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main5 {

    public static void main(String[] args) {

        List<String> list = List.of("ania", "basia", "celina", "dominika", "emilia");

        System.out.println("wyswietl wszystko");
        System.out.println(list);

        System.out.println("znajdz elementy zawierajace n");
        Predicate predicate = s -> s.toString().contains("n");
        System.out.println(search(list, predicate));

        System.out.println("pokaż długość słów");
        Function function = s -> s.toString().length();
        System.out.println(changeCollection(list, function));

        System.out.println("Wyświetl wszystko przy pomocy metody");
        Consumer consumer = System.out::println;
        consumeCollection(list, consumer);

    }

    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function) {
        return collection.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        collection.stream()
                .forEach(consumer);
    }
}