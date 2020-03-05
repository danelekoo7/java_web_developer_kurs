package java_podstawy.a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - i - 1];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
