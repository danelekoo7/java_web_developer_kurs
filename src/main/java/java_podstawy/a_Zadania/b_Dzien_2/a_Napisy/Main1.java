package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

import java.net.SocketOption;

public class Main1 {

    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        int index = str.length() - 2;
        char character = str.charAt(index);
        char[] tab = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == character) {
                sum++;
            }
        }
        System.out.println(character);
        System.out.println(sum);
    }
}