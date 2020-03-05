package java_podstawy.a_Zadania.e_Dzien_5.exam;

import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        String str = Arrays.toString(div(a,b));
        System.out.println(str);
    }

    static int[] div(int size, int interval) {
        Random r = new Random();
        int[] tab = new int[size];
        for (int i = 0; i < size; i++) {
            int a = r.nextInt(interval ) + 1;
            if (a % 2 == 0 & a % 3 != 0) {
                tab[i] = a;
            } else {
                a = r.nextInt(interval) + 1;
                i -= 1;
            }
        }
        return tab;
    }
}
