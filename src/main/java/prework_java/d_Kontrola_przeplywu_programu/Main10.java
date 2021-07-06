package prework_java.d_Kontrola_przeplywu_programu;

public class Main10 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 1; j <= i; j++) {
                if (i >= j) {
                    row += "* ";
                }
            }
            System.out.println(row);
        }
    }
}