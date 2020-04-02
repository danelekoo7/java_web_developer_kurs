package java8.a_Zadania.b_Dzien_2.d_Optional_Date_Api.zad5;

import java.time.LocalDate;
import java.time.Month;

public class Main5 {
    public static void main(String[] args) {

        for (int i = 2020; i <2030 ; i++) {
            LocalDate date = LocalDate.of(i, Month.DECEMBER, 24);
            System.out.println(date.getDayOfWeek());
        }
    }
}
