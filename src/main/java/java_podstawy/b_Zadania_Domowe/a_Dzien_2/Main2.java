package java_podstawy.b_Zadania_Domowe.a_Dzien_2;


public class Main2 {

    public static void main(String[] args) {
        String text = "jakisz textz";
        int shift = 9;
        String wynik = encode(text, shift);
        System.out.println(wynik);
        int number = 9;
        String result = decode(wynik, number);
        System.out.println(result);
    }

    static String encode(String str, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456 ,.-";
        char[] alphabetArray = alphabet.toCharArray();
        char[] strArray = str.toCharArray();
        char[] newStr = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < alphabetArray.length; j++) {
                if (strArray[i] == alphabetArray[j]) {
                    if (j + shift < alphabetArray.length)
                        newStr[i] = alphabetArray[j + shift];
                    else {
                        newStr[i] = alphabetArray[j + shift - alphabetArray.length];
                    }
                }
            }
        }
        String result = new String(newStr);
        return result;
    }

    static String decode(String str, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456 ,.-";
        char[] alphabetArray = alphabet.toCharArray();
        char[] strArray = str.toCharArray();
        char[] newStr = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < alphabetArray.length; j++) {
                if (strArray[i] == alphabetArray[j]) {
                    if (j - shift >= 0)
                        newStr[i] = alphabetArray[j - shift];
                    else {
                        newStr[i] = alphabetArray[j - shift + alphabetArray.length];
                    }
                }
            }
        }
        String result = new String(newStr);
        return result;
    }
}