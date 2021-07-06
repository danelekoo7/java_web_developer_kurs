package java8.b_Zadania_Domowe.zadanie_poboczne;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("podaj liczbę całkowitą większą od 2 liczbę");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean notPrimeNumber = false;
        boolean mersennesNumber = false;


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                notPrimeNumber = true;
            }
        }

        boolean loop = true;
        int i = 1;
        while (loop) {
            int mersenesNumber = (int) Math.pow(2, i) - 1;

            if (number == mersenesNumber) {
                mersennesNumber = true;
                loop = false;
            }
            if (mersenesNumber >= number) {
                loop = false;
            }

            i++;
        }

        if (!notPrimeNumber && !mersennesNumber) {
            System.out.println("Number " + number + " is prime");
        }

        if (mersennesNumber && notPrimeNumber) {
            System.out.println("Number " + number + " is Mersenn's");
        }

        if (mersennesNumber && !notPrimeNumber) {
            System.out.println("Number " + number + " is Mersenn's prime");
        }

    }
}
