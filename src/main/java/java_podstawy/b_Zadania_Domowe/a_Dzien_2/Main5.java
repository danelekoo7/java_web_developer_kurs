package java_podstawy.b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {
        String str = "ala ma kota";
        char forReplace = 'a';
        char replacment = 'o';
        System.out.println(replaceChar(str, forReplace, replacment));
    }

    static String replaceChar(String str, char forReplace, char replacement) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == forReplace) {
                strArray[i] = replacement;
            }
        }
        String result = new String(strArray);
        return result;
    }
}