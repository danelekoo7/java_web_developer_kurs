package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad1;

import java8.b_Zadania_Domowe.b_Dzien_2.zad4.Inspectionable;

public class Car extends Vehicle implements Inspectionable {

    private String type;

    public Car(Integer maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void createInspection() {
        System.out.println("Model: " + getModel() + " - sprawdzony");
    }
}