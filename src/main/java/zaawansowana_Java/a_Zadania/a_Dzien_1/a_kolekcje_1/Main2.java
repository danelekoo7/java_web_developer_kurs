package zaawansowana_Java.a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        final ArrayList<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(11);
        elements.add(12);
        elements.add(13);
        elements.add(14);
        elements.add(15);
        elements.add(16);
        elements.add(17);
        elements.add(18);
        elements.add(19);

        System.out.println(elements);
        removeDivider(elements, 2);
        System.out.println(elements);
    }

    public static void removeDivider(List<Integer> list, int divider) {
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % divider == 0) {
                iterator.remove();
            }
        }
    }
}
