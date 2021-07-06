package prework_java.e_Tablice;

public class Main2 {
    public static void main(String[] args) {
        String[] fruits = {"kiwi", "malina", "pomarańcza", "truskawka", "agrest", "banan"};
        System.out.println("Pierwszy owoc to: " + fruits[0]);
        System.out.println("Ostatni owoc to: " + fruits[fruits.length - 1]);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}