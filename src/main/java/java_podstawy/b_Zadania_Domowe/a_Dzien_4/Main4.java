package java_podstawy.b_Zadania_Domowe.a_Dzien_4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedArray()));
    }

    static int[] sortedArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wylosować");
        int number = scan.nextInt();
        int[] randArray = new int[number];
        Random r = new Random();
        for (int i = 0; i < number; i++) {
            randArray[i] = r.nextInt(101);
        }
        Arrays.sort(randArray);
        return randArray;
    }
}
