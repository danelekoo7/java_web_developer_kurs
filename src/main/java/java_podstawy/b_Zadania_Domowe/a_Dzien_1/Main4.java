package java_podstawy.b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[][] arrayOfInt = {{2, 97565, 2}, {3, 3, 3}, {7, 4, 4}};
        int[] result = lessMore(arrayOfInt);
        System.out.println("liczb większych od średniej jest: " + result[0] + " liczb mniejszych od średniej jest: " + result[1]);
    }

    static int[] lessMore(int[][] arr) {
        double sum = 0;
        int[] moreLess = {0, 0};
        double avg = 0;
        double counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                counter++;
            }
        }
        avg = sum / counter;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    moreLess[0] += 1;
                } else if (arr[i][j] < avg) {
                    moreLess[1] += 1;
                }
            }
        }
        return moreLess;
    }
}