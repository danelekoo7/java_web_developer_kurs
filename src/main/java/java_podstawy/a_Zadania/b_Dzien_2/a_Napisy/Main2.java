package java_podstawy.a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        char c = 'c';
        int taskSecond = charPos(str, c);
        System.out.println(taskSecond);
    }

    static int charPos(String str, char c) {
        char[] tab = str.toCharArray();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (tab[i] == c) {
                result = i;
                i = str.length();
            }
        }
        return result;
    }
}
