package prework_java.c_Operatory;

public class Main5 {
    public static void main(String[] args) {
        int a = 1;
        int b;
        //najpierw zwiększono wartość a, później ją wyświtlono (a=2)
        System.out.println(++a);
        //najpierw wyświetlono wartość (a=2) , później zwiększono wartość (a=3)
        System.out.println(a++);
        //wyświetlono wartość (a=3)
        System.out.println(a);
        //przepisano wartość a do b (b=3), później zwiększono wartość a (a=4)
        b = a++;
        //wyświetlono wartość (b=3)
        System.out.println(b);
        //zwiększono wartość a (a=5) i przypisano ją do b.
        b = ++a;
        //zwiększono wartość a (a=6) i ją wyświetlono
        System.out.println(++a);
    }
}