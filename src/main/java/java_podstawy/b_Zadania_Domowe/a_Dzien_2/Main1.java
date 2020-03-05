package java_podstawy.b_Zadania_Domowe.a_Dzien_2;


public class Main1 {

    public static void main(String[] args) {
        String text = "jakisz textz";
        String wynik = encode(text);
        System.out.println(wynik);
    }

    static String encode(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456 ,.-";
        char[] alphabetArray = alphabet.toCharArray();
        char[] strArray = str.toCharArray();
        char[] newStr = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < alphabetArray.length; j++) {
                if (strArray[i] == alphabetArray[j]) {
                    if (j + 3 < alphabetArray.length)
                        newStr[i] = alphabetArray[j + 3];
                    else {
                        newStr[i] = alphabetArray[j + 3 - alphabetArray.length];
                    }
                }
            }
        }
        String result = new String(newStr);
        return result;
    }
}