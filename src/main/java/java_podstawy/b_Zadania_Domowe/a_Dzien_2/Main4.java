package java_podstawy.b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {
        String str = "aaabbbcccdasdftewfff";
        System.out.println(tripple(str));
    }

    static int tripple(String str) {
        int counter = 0;
        char[] strArray = str.toCharArray();
        for (int i = 2; i < strArray.length; i++) {
            if (strArray[i] == strArray[i - 1] & strArray[i] == strArray[i - 2]) {
                counter += 1;
            }
        }
        return counter;
    }
}
