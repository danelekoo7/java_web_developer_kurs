package java_podstawy.a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 5, 6, 2, 1, 7, 8, 3};
        int[] secondNumners = {2, 4, 5, 2, 3, 1, 4, 9, 8, 3};
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] + secondNumners[i];
        }
        System.out.print(Arrays.toString(result));
    }
}