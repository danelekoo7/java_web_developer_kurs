package java_podstawy.b_Zadania_Domowe.a_Dzien_2;

public class Main7 {

    public static void main(String[] args) {
        String str = "ala ma kota a tomek ma autko ";
        String[] words = {"ma", "kota"};
        System.out.println(censor(str, words));
    }

    static String censor(String str, String[] words) {
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (strArray[i].equals(words[j])) {
                    strArray[i] = "****";
                }
            }
        }
        String result = String.join(" ", strArray);
        return result;
    }
}