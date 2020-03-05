package java_podstawy.b_Zadania_Domowe.a_Dzien_1;


public class Main2 {

    public static void main(String[] args) {
        int liczbaA = 8;
        int liczbaB = 4;
        boolean wynik = divisibleBy(liczbaA, liczbaB);
        System.out.println("Czy liczba " + liczbaA + " jest podzielna przez " + liczbaB + " :" + wynik);
    }

    static boolean divisibleBy(int a, int b) {
        boolean result;
        if (a % b == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}