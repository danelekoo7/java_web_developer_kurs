package java_podstawy.b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        int[] result = append(Array);
        System.out.println(Arrays.toString(result));
    }

    static int[] append(int[] arr) {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length * 2; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[(arr.length * 2) - 1 - i];
            }
        }
        return newArr;
    }
}