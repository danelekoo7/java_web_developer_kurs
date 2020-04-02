package java8.b_Zadania_Domowe.a_Dzien_1.extra.zad2;

public class Test {
    public static void main(String[] args) {
        A a1 = new A() {
            public void printValue() {
                System.out.println("A");
            }
        };
        a1.printValue();
    }
}