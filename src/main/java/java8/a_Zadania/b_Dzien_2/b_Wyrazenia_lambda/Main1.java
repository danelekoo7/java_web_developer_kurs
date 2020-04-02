package java8.a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        int n = 3;
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj slowo");
            list.add(scanner.next());
        }

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        List<String> stringList = Arrays.asList("kot", "ala", "kucyk", "krzesło", "ala", "słoń", "jabłko");

        stringList.sort((s, t1) -> s.compareTo(t1));

        System.out.println(stringList);
    }
}
