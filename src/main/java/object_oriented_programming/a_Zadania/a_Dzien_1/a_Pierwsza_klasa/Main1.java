package object_oriented_programming.a_Zadania.a_Dzien_1.a_Pierwsza_klasa;


public class Main1 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        if (cat.equals(dog)){
            System.out.println("true ");
        } else {
            System.out.println("false");
        }
    }
}
