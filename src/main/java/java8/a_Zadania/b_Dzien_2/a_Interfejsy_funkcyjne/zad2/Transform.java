package java8.a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.zad2;

@FunctionalInterface
public interface Transform<T, S> {
    T transform(S s);
}