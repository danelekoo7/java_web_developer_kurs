package java_podstawy.b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {
        String str = "ale ma kota a tomek ma autko";
        String forReplace = "ko";
        String replacment = "aa";
        System.out.println(replaceStr(str, forReplace, replacment));
    }

    static String replaceStr(String str, String forReplace, String replacement) {
        String replaceAllText = str.replaceAll(forReplace, replacement);
        return replaceAllText;
    }
}