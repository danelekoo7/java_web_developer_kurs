package java_podstawy.b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {
        System.out.println(getLength("ala ma kota"));
    }

    static int getLength(String str) {
        int result = 0;
        if (str != null) {
            char[] tab = str.toCharArray();
            result = tab.length;
        }
        return result;
    }
}
