package java_podstawy.a_Zadania.e_Dzien_5.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnTab()));
    }

    static int[] returnTab(){
        System.out.println("podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] tab = new int[n];
        for (int i = 0; i <n ; i++) {
            tab[i]=i+1;
        }
        return tab;
    }
}
