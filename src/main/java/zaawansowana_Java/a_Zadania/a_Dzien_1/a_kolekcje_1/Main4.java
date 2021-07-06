package zaawansowana_Java.a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(reverse(Main3.initialize()).toString());
    }

//    public static List<City> reverse (List<City> list ){
//        List<City> listAfterChanges = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//                listAfterChanges.add(list.get(list.size()-i-1));
//        }
//        return listAfterChanges;
//    }

    public static List<City> reverse (List<City> list ){
        ListIterator<City> listIterator = list.listIterator(list.size());
        List<City> listAfterChanges = new ArrayList<>();
        while (listIterator.hasPrevious()){
           listAfterChanges.add(listIterator.previous());
       }
        return listAfterChanges;
    }

    public static List<City> threeElements (List<City> list, String a ){
        ListIterator<City> listIterator = list.listIterator();
        List<City> listAfterChanges = new ArrayList<>();
        while (listIterator.hasNext()){
        }
        return listAfterChanges;
    }
}
