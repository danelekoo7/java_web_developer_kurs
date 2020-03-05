package java_podstawy.a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) {
        String str = "Z Coders Lab niezależnie od wykształcenia możesz zmienić swoją karierę." +
                " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania." +
                " Przygotujemy Cię do pracy na stanowisku junior web developera i pomożemy znaleźć zatrudnienie po kursie.";
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String temp = stringTokenizer.nextToken();
            System.out.println(temp);
        }
    }
}
