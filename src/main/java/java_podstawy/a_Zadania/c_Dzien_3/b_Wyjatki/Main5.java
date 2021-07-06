package java_podstawy.a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main5 {

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("5");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } finally {
            System.out.println("to jest finally");
        }
    }
}