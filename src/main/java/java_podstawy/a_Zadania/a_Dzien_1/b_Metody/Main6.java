package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    public static void main(String[] args) {
        int wiek = 18;
        boolean check = checkMaturity(wiek);
        System.out.println("Czy użytkownik jest pełnoletni? " + check);
    }

    static boolean checkMaturity(int age) {
        boolean result;
        if (age >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}