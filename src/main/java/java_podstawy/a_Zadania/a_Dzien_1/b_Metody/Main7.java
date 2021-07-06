package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {
        int liczba = 176;
        String wynik = checkEvenOdd(liczba);
        System.out.println(wynik);
    }

    static String checkEvenOdd(int number) {
        String result;
        if (number % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        return result;
    }
}
