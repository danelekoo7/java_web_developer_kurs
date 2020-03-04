package prework_java.c_Operatory;

public class Main7 {
    public static void main(String[] args) {
        int nr1 = 7;
        int nr2 = 4;
        int result;
        result = nr1 + nr2;
        System.out.println(result);
        nr1 = 10;
        result = nr1 + nr2;
        System.out.println(result);
        //wyniki są różne ponieważ zmienne "nr1" i "result" zostały nadpisane
    }
}