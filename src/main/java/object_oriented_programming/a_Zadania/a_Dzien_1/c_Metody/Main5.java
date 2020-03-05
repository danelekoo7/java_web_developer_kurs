package object_oriented_programming.a_Zadania.a_Dzien_1.c_Metody;

public class Main5 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Passat");
        car.setBrand("VW");
        car.setPrice(5000);

        System.out.println(car.toString());
    }
}
