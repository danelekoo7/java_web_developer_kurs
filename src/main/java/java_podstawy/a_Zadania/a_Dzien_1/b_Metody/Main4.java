package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {
        String imie = "daniel ";
        String nazwisko = "jedrus ";
        String nick = "danelekoo7 ";
        String wynik;
        wynik = createName(imie, nazwisko, nick);
        System.out.println(wynik);
    }

    static String createName(String name, String surname, String nickname) {
        String result = name + nickname + surname;
        return result;
    }
}