package java8.a_Zadania.b_Dzien_2.d_Optional_Date_Api.zad6;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTime {
    public static void main(String[] args) {
        Map<String, LocalTime> mapTime = getMapTime();
        mapTime.entrySet().forEach(System.out::println);
    }

    public static Map<String, LocalTime> getMapTime(){

        Map<String, LocalTime> collect = ZoneId.getAvailableZoneIds().stream()
                .collect(Collectors.toMap(s -> s, s -> LocalTime.now(ZoneId.of(s))));

        return collect;
    }
}
