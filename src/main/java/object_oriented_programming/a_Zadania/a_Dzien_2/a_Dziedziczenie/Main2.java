package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 5, "red", 5);
        System.out.println(circle.getDescription());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircuit());
        Shape shape = new Shape( 5, 4, "blue");

        System.out.println(circle.getDistance(shape));
    }

}
