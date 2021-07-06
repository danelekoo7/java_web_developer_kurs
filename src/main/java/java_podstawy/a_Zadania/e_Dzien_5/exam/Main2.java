package java_podstawy.a_Zadania.e_Dzien_5.exam;

public class Main2 {

    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw";
        int length = 2;
        System.out.println(shorten(str, length));
    }

    static String shorten(String str, int length){
        char [] array = str.toCharArray();
        char [] newArray = new char[length];
        for (int i = 0; i <length ; i++) {
            newArray[i]=array[i];
        }
        String result = new String(newArray);
        return result;
    }
}
