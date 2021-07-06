package object_oriented_programming.a_Zadania.a_Dzien_1.c_Metody;


public class Main1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ada");
        person.setAge(20);
        person.setSurname("cosik");
        person.setGender("female");
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
        person.increaseAge();
        System.out.println(person.getAge());
    }
}
