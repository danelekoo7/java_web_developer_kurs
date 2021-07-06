package java8.b_Zadania_Domowe.a_Dzien_1.extra.zad3;

public class Test implements InfA{
    public String getName(){
        return "test-name";
    }
    public static void main (String[] args){
        Test t = new Test();
        System.out.println(t.getName());
    }
}