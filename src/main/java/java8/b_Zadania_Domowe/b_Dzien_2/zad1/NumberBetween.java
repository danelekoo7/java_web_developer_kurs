package java8.b_Zadania_Domowe.b_Dzien_2.zad1;

public class NumberBetween implements NumberCheck {
    @Override
    public boolean check(Number number) {
        return number.doubleValue() > 0 &&
                number.doubleValue() < 100;
    }
}
