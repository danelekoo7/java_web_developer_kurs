package java_podstawy.a_Zadania.e_Dzien_5.exam;

public class Main6 {
    public static void main(String[] args) {
        String str = "Ala ma kota a ania ma psaas";
        String a = "a";
        String b = "do";
        System.out.println(replaceStr(str,a,b));
    }

    static String replaceStr(String str, String forReplace, String replacement){
       return str.replaceAll(forReplace,replacement);
    }
}
