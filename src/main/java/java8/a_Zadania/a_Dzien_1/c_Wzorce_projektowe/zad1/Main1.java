package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad1;


public class Main1 {
    public static void main(String[] args) {
        AppConfig instance = AppConfig.getInstance();
        AppConfig instance2 = AppConfig.getInstance();
        AppConfig instance3 = AppConfig.getInstance();
        AppConfig instance4 = AppConfig.getInstance();
        AppConfig instance5 = AppConfig.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
        System.out.println(instance5);

    }
}