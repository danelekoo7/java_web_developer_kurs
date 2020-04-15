package spring.homework.day1.src.main.java.pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.homework.day1.src.main.java.pl.coderslab.bean.Customer;
import spring.homework.day1.src.main.java.pl.coderslab.bean.MemoryCustomerRepository;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("task 3");

        Customer customer = new Customer(1, "Ddasds", "Addsa");
        Customer customer2 = new Customer(2, "BBBddd", "GGGddd");

        MemoryCustomerRepository memoryCustomerRepository =
                context.getBean("memoryCustomerRepository", MemoryCustomerRepository.class);

        System.out.println("read 1");
        memoryCustomerRepository.readCustomers();
        memoryCustomerRepository.addCustomer(customer);
        memoryCustomerRepository.addCustomer(customer2);

        System.out.println("read 2");
        System.out.println(memoryCustomerRepository.readCustomers());

        System.out.println("read 3");
        memoryCustomerRepository.deleteCustomer(customer);
        memoryCustomerRepository.readCustomers();
    }
}
