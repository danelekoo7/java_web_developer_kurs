package zaawansowana_Java.a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        final Map<String, Country> countries = getMap(initialize());
        final Iterator<String> iterator = countries.keySet().iterator();
        while (iterator.hasNext()) {
            final String capital = iterator.next();
            System.out.println(capital + " - " + countries.get(capital).getName());
        }
    }

    public static List<Country> initialize() {
        final List<Country> countries = new ArrayList<>();
        Country country1 = new Country("Polska", "Warszawa");
        Country country2 = new Country("Rosja", "Moskwa");
        Country country3 = new Country("Niemcy", "Berlin");
        Country country4 = new Country("Francja", "Paryż");
        Country country5 = new Country("Anglia", "Londyn");
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        return countries;
    }

    public static Map<String, Country> getMap(List<Country> list) {
        final HashMap<String, Country> map = new HashMap<>();
        for (Country country : list) {
            map.put(country.getCapital(), country);
        }
        return map;
    }
}
