package java8.b_Zadania_Domowe.zadanie_poboczne;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> degrees = new ArrayList<>();
        degrees.add(78);
        degrees.add(78);
        degrees.add(80);
        degrees.add(85);
        degrees.add(89);
        degrees.add(90);
        degrees.add(91);
        degrees.add(90);

        for (int i = 0; i <degrees.size() ; i++) {
            if (i<4){
                System.out.println(degrees.get(i) + "  ----");
            } else {
                if ((degrees.get(i)-degrees.get(i-4))>=10){
                    System.out.println(degrees.get(i) + "  right");
                } else {
                    System.out.println(degrees.get(i) +"  ----");
                }
            }
        }
    }
}
