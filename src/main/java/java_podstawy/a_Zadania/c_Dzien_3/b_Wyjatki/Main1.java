package java_podstawy.a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main1 {

    public static void main(String[] args) {
        try {
            int result = factorial(0);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Błąd");
        }
    }

    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}