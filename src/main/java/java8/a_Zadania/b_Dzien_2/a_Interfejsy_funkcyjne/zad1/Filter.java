package java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad1;

@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);
}
