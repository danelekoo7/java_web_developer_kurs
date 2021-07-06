package java_podstawy.b_Zadania_Domowe.a_Dzien_3;

import java.util.NoSuchElementException;

public class Main5 {

    public static void main(String[] args) {
        int[] ele = new int[]{1, 2, 5, 77, 22, 66, 214, 7, 414};
        int value = 77;
        try {
            System.out.println(indexOf(ele, value));
        } catch (NoSuchElementException ex) {
            System.out.println("brak takiego elementu w tablicy");
        }
    }

    static int indexOf(int[] elements, int value) throws NoSuchElementException {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                index = i;
            }
        }
        if (index == -1) {
            throw new NoSuchElementException();
        }
        return index;
    }
}