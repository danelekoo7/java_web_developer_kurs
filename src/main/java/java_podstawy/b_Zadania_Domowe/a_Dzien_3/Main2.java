package java_podstawy.b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {
        String[] tablica = {"cos","się","dzieje"};
        System.out.println(safeGet(tablica,1));
    }

    static String safeGet(String[] strTab, int index){
        String result = "";
        try {
            result=strTab[index];
        } catch ( ArrayIndexOutOfBoundsException ex){
            System.out.println("Zły indeks ");
        }
        return result;
    }
}