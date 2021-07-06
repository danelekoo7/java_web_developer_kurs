package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result;
        result = multiply(a, b);
        System.out.println(result);
    }

    static int multiply(int multipler, int index) {
        int result = multipler * index;
        return result;
    }
}