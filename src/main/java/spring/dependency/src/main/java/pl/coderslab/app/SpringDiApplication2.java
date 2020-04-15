package spring.dependency.src.main.java.pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.dependency.src.main.java.pl.coderslab.beans.*;

public class SpringDiApplication2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld2 helloWorld2 = context.getBean("helloWorld2",HelloWorld2.class);
        helloWorld2.hello();


        Ship ship = context.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();

        ScopeSingleton singleton1 = context.getBean(ScopeSingleton.class);
        System.out.println(singleton1);
        ScopeSingleton singleton2 = context.getBean(ScopeSingleton.class);
        System.out.println(singleton2);
        System.out.println((singleton1 == singleton2) + ": ten sam obiekt\n");
        ScopePrototype prototype1 = context.getBean(ScopePrototype.class);
        System.out.println(prototype1);
        ScopePrototype prototype2 = context.getBean(ScopePrototype.class);
        System.out.println(prototype2);
        System.out.println((prototype1 == prototype2) + ": dwa różne obiekty");


        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());

    }

}
