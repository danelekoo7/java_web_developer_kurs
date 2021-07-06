package java8.b_Zadania_Domowe.b_Dzien_2.zad6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Main6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println("a) ostatni dzień aktualnego miesiąca");
        LocalDate endOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        DayOfWeek lastDay = endOfMonth.getDayOfWeek();
        System.out.println(lastDay);


        System.out.println("b) dzień w który wypadnie następny piątek");
        int i = 0;
        while (true) {
            LocalDate testDate = now.plus(Period.ofDays(i));
            if (testDate.getDayOfWeek().toString().equals("FRIDAY")) {
                System.out.println(testDate);
                break;
            }
            i++;
        }


        System.out.println("c) pierwszy dzień następnego miesiąca");
        LocalDate firstDayOfNextMonth = LocalDate.of(now.getYear(), (now.getMonth().getValue() + 1), 1);
        System.out.println(firstDayOfNextMonth.getDayOfWeek());
    }
}
