package java_podstawy.a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("nie dziel przez zero");
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        int result = 0;
        result = a / b;
        return result;
    }
}
