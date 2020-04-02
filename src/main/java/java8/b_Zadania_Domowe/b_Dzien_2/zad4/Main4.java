package java8.b_Zadania_Domowe.b_Dzien_2.zad4;


import java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad1.Car;
import java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad1.Train;
import java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad1.Vehicle;

public class Main4 {
    public static void main(String[] args) {

        Vehicle[] tab = new Vehicle[3];

        tab[0] = new Car(20, "VW", "type");
        tab[1] = new Train(100, "pendolino", 600);
        tab[2] = new Car(222, "skoda", "citigo");

        for (Vehicle vehicle : tab) {
            if (vehicle instanceof Inspectionable) {
                Inspectionable inspectionable = (Inspectionable) vehicle;
                inspectionable.createInspection();
            }
            System.out.println(vehicle.toString());
        }
    }
}
