package java8.a_Zadania.b_Dzien_2.d_Optional_Date_Api.zad7;

import java.time.LocalDate;
import java.time.Period;

public class Main7 {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(1970, 1, 1);
        LocalDate now = LocalDate.now();
        long period = Period.between(start, now).toTotalMonths();
        System.out.println(period);
    }
}
