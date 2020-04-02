package java8.b_Zadania_Domowe.b_Dzien_2.zad1;

@FunctionalInterface
public interface NumberCheck<V extends Number> {
    boolean check(V v);
}
