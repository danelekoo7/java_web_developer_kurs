package java_podstawy.a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main2 {

    public static void main(String[] args) {
        int[] tab = {5, 1, 6, 7, 8};
        try {
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indeks poza zakresem");
        }
    }
}