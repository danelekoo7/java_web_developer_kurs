package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad4;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {
    private String content;
    private String title;

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }


    private List<Observer> observers;

    public Post() {
        observers = new ArrayList<>();
    }


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(title);
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
