package java8.a_Zadania.b_Dzien_2.d_Optional_Date_Api.zad2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main2 {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(s -> s.contains("Europe"))
                .map(elem -> ZonedDateTime.now(ZoneId.of(elem)))
                .forEach(System.out::println);
    }
}
