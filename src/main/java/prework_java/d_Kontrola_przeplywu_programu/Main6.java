package prework_java.d_Kontrola_przeplywu_programu;

public class Main6 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - parzysta");
            } else {
                System.out.println(i + " - nieparzysta");
            }
        }
        int j = 0;
        while (j <= n) {
            if (j % 2 == 0) {
                System.out.println(j + " - parzysta");
            } else {
                System.out.println(j + " - nieparzysta");
            }
            j++;
        }
    }
}