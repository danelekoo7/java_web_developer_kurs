package java8.a_Zadania.a_Dzien_1.b_Interfejsy.zad3;

public class Main1 {
    public static void main(String[] args) {
        Moveable[] moveableTab = new Moveable[3];
        moveableTab[0]=new Cat();
        moveableTab[1]=new Car();
        moveableTab[2]=new Person();

        for (Moveable moveable : moveableTab) {
            moveable.start();
        }
    }
}
