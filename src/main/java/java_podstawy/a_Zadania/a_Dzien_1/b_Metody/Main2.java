package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main2 {

    public static void main(String[] args) {
        int number = 8;
        int afterPow = square(number);
        System.out.println(afterPow);
    }

    static int square(int num) {
        int result = num * num;
        return result;
    }
}
