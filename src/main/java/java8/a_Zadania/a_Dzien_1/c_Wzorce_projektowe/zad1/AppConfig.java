package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad1;

public class AppConfig {
    private static AppConfig instance;

    private AppConfig() {
        System.out.println("aaa");
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}