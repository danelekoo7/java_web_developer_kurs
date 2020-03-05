package java_podstawy.b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {
        average("9", "2");
    }

    static void average(String a, String b) {
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            double result = numA / numB;
            System.out.println(result);
        } catch (NumberFormatException ex) {
            System.out.println("Proszę podać liczbę całkowitą");
        } catch (ArithmeticException e) {
            System.out.println("Pamiętaj cholero, nie dziel przez zero");
        } finally {
            System.out.println("koniec");
        }
    }
}