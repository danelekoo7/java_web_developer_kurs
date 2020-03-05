package java_podstawy.b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[][] arrayOfInt = {{2, 8, 1, 5, 6, 2, -5}, {8, 5, 2, 14, 6, -2, 97, 52, 452, 41, 2, 4}, {2, 5, 4, -3, 2, 6, 2114, 523, 2, 4}};
        int[] result = minimum(arrayOfInt);
        System.out.println(Arrays.toString(result));
    }

    static int[] minimum(int[][] arr) {
        int[] minValue = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            minValue[i] = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <= minValue[i]) {
                    minValue[i] = arr[i][j];
                }
            }
        }
        return minValue;
    }
}