package java_podstawy.a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100);
        int[] randNumbers = new int[20];
        int min = 111;
        for (int i = 0; i < 20; i++) {
            a = r.nextInt(101);
            randNumbers[i] = a;
            if (randNumbers[i] < min) {
                min = randNumbers[i];
            }
        }
        System.out.println("najmniejsza liczba to: " + min);
    }
}