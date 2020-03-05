package zaawansowana_Java.a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(getMap());
        Map<String, String> newMap = getMap();
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (String first : newMap.keySet()) {
            String second = newMap.get(first);
            System.out.println("Podaj przeciwieństwo do: ");
            System.out.println(first);
            String values = scanner.nextLine();
            newMap.put(first, values);
            if (values.equals(second)) {
                counter++;
            }
        }
        System.out.println(newMap);
        System.out.println("Liczba poprawnych odpowiedzi to: " + counter);
    }

    public static Map<String, String> getMap() {
        final HashMap<String, String> map = new HashMap<>();
        map.put("ciepło", "zimno");
        map.put("nisko", "wysoko");
        map.put("daleko", "blisko");
        map.put("dużo", "mało");
        map.put("wolno", "szybko");
        return map;
    }
}
