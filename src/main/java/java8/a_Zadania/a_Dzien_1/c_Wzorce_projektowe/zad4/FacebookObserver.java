package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad4;

public class FacebookObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("Facebook update event " + title);
    }
}
