package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad1;

public class Main1 {

    public static void main(String[] args) {
        Vehicle[] tab = new Vehicle[2];

        tab[0] = new Car(20,"VW", "type");
        tab[1] = new Train(100, "pendolino", 600);

        for (Vehicle vehicle : tab) {
            System.out.println(vehicle.toString());
        }
    }
}
