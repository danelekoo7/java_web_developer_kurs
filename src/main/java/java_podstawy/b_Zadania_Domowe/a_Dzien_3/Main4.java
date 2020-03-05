package java_podstawy.b_Zadania_Domowe.a_Dzien_3;


import java.net.SocketOption;

public class Main4 {

    public static void main(String[] args) {
        String str = "55";
        System.out.println(toInt(str));
    }

    static int toInt(String str) {
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println("Podaj liczbę typu int");
        }
        return result;
    }
}