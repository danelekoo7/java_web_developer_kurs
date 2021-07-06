package java8.b_Zadania_Domowe.a_Dzien_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("celina", "calusinska"));
        personList.add(new Person("anna", "ankowska"));
        personList.add(new Person("bozena", "bykowska"));

        Collections.sort(personList);

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
