package java_podstawy.a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            String temp = stringTokenizer.nextToken();
            System.out.println(temp);
        }
    }
}
