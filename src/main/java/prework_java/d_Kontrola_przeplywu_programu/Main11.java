package prework_java.d_Kontrola_przeplywu_programu;

public class Main11 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n * 2; i++) {
            String row = "";
            for (int j = 1; j <= n; j++) {
                if (((i >= j) & (i <= n))) {
                    row += "* ";
                } else if ((i > n) & (((n * 2) - i) >= j - 1)) {
                    row += "* ";
                } else {
                    row += j + " ";
                }
            }
            System.out.println(row);
        }
    }
}