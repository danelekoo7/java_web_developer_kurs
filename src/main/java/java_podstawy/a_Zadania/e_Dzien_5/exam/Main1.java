package java_podstawy.a_Zadania.e_Dzien_5.exam;

import java.net.SocketOption;

public class Main1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(rectangle(a, b));
    }

    static int rectangle(int a, int b) {
        int result = a * b;
        return result;
    }
}
