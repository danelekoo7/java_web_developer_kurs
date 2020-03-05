package java_podstawy.a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        String zmienna = null;
        if (zmienna != null) {
            showLength(zmienna);
        }
    }

    static void showLength(String s) {
        System.out.println(s.length());
    }
}
