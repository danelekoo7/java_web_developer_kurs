package java_podstawy.b_Zadania_Domowe.a_Dzien_2;

public class Main3 {

    public static void main(String[] args) {
        String str = "coderslab kurs javy";
        int number = 3;
        System.out.println(upperCase(str, number));
    }

    static String upperCase(String str, int index) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (i % index == 0) {
                strArray[i] = Character.toUpperCase(strArray[i]);
            }
        }
        String result = new String(strArray);
        return result;
    }
}