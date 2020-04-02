package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad4;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

}

