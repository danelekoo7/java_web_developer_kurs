package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main1 {
    public static void main(String[] args) {
        Shape shape = new Shape(-1,-3,"blue");
        double distance = shape.getDistance(new Shape(-9,0,"green"));
        System.out.println(distance);

        System.out.println(shape.getDescription());


    }
}
