package java_podstawy.b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    public static void main(String[] args) {
        double wiek = 1.5;
        double wynik;
        wynik = dogAge(wiek);
        System.out.println("wiek psa to: " + wynik);
    }

    static double dogAge(double age) {
        double result;
        if (age <= 2) {
            result = age * 10.5;
        } else {
            result = (2 * 10.5) + ((age - 2) * 4);
        }
        return result;
    }
}