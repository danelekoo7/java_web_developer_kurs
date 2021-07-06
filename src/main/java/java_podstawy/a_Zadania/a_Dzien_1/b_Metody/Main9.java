package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;

public class Main9 {
    public static void main(String[] args) {
        int liczba = 3;
        int wynik = factorial(liczba);
        System.out.println(wynik);
    }

    static int factorial(int n) {
        int tempValue = 1;
        for (int i = 1; i <= n; i++) {
            tempValue = tempValue * i;
        }
        return tempValue;
    }
}