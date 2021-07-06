package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad2;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();

        list.add(new Rectangle(2, 4));
        list.add(new Rectangle(3, 6));
        list.add(new Square(3));
        list.add(new Square(5));
        list.add(new Circle(3));
        list.add(new Circle(5));


        for (Shape shape : list) {
            System.out.println(shape);
        }
    }
}
