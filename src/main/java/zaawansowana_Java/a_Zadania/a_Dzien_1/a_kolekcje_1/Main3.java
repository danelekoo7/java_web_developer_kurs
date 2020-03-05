package zaawansowana_Java.a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("---task 1---");
        System.out.println(initialize().toString());

        System.out.println("---task 2---");
        System.out.println(firstSubList(initialize(), 2, 4).toString());

        System.out.println("---task 3---");
        System.out.println(secondSubList(initialize(),2,3));

    }

    public static List<City> initialize() {
        City city1 = new City("Kato", 100000);
        City city2 = new City("Gliwice", 430000);
        City city3 = new City("Tychy", 760000);
        City city4 = new City("Rybnik", 230000);
        City city5 = new City("Myslowice", 150000);
        final ArrayList<City> elements = new ArrayList<>();
        elements.add(city1);
        elements.add(city2);
        elements.add(city3);
        elements.add(city4);
        elements.add(city5);
        return elements;
    }

    public static List<City> firstSubList(List<City> list, int start, int end) {
        List<City> listAfterChanges = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= start - 1 && i <= end - 1) {
                listAfterChanges.add(list.get(i));
            }
        }
        return listAfterChanges;
    }

    public static List<City> secondSubList(List<City> list, int start, int end) {
        List<City> listAfterChanges = new ArrayList<>();
        listAfterChanges = list.subList(start,end);
        return listAfterChanges;
    }
}
