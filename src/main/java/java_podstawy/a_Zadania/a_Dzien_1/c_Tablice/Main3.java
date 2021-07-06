package java_podstawy.a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int a = 2;
        int[] tab = new int[10];
        Arrays.fill(tab, a);
        System.out.print(Arrays.toString(tab));
    }
}