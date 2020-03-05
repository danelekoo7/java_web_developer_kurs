package java_podstawy.a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        rowsColumns();
    }

    static void rowsColumns() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double counter = 0;
        System.out.println("Podaj pierwszą liczbę ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę ");
        int b = scanner.nextInt();
        double[][] array = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = counter;
                sum += counter;
                counter += 1;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Suma elementów to : " + sum);
        System.out.println("Średnia elementów to : " + (sum / counter));
    }
}