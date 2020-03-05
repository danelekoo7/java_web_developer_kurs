package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {

    public static void main(String[] args) {
        String word = "TaK";
        String newWord = toggleChar(word);
        System.out.println(newWord);
    }

    static String toggleChar(String str) {
        char[] chars = str.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                result[i] = Character.toUpperCase(chars[i]);
            } else if (Character.isUpperCase(chars[i])) {
                result[i] = Character.toLowerCase(chars[i]);
            } else {
                result[i] = chars[i];
            }
        }
        String afterChanging = new String(result);
        return afterChanging;
    }
}
