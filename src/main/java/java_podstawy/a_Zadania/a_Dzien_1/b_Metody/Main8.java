package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;

public class Main8 {
    public static void main(String[] args) {
        int x = -111;
        int y = -78;
        int z = -9999;
        int wynik = maxOfThree(x, y, z);
        System.out.println(wynik);
    }

    static int maxOfThree(int a, int b, int c) {
        int max;
        {
            if (a >= b & a >= c) {
                max = a;
            } else if (b >= a & b >= c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }
}