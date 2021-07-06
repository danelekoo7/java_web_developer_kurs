package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {
    public static void main(String[] args) {
        int teamAfieldA = 1;
        int teamBfieldA = 2;
        int teamAfieldB = 5;
        int teamBfieldB = 0;
        char wynik = footballWin(teamAfieldA, teamBfieldA, teamAfieldB, teamBfieldB);
        System.out.println("Wygrał : " + wynik);
    }

    static char footballWin(int a, int b, int c, int d) {
        char result;
        if ((a + c > (b + d))) {        //sprawdzenie czy zespol a ma wiecej goli
            result = '1';
        } else if ((a + c < (b + d))) { //sprawdzenie czy zespol b ma wiecej goli
            result = '2';
        } else if ((a == d) & (b == c)) {
            result = 'X';
        } else if ((a + c) == (b + d) & c > b) {
            result = '1';
        } else if ((a + c) == (b + d) & c < b) {
            result = '2';
        } else {
            result = 'e';
            System.out.println("Wystąpił błąd");
        }
        return result;
    }
}
