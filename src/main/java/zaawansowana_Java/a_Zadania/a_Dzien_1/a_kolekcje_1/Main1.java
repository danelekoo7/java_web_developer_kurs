package zaawansowana_Java.a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
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

        System.out.println("---for loop---");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }

        System.out.println("---iterator with while---");
        final Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---iterator with for---");
        for (Iterator<Integer> iterator2 = elements.iterator(); iterator2.hasNext(); ) {
            System.out.println(iterator2.next());
        }

        System.out.println("--- for-each loop ---");
        for (int element : elements) {
            System.out.println(element);
        }
    }
}
