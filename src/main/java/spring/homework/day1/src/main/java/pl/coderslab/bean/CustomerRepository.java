package spring.homework.day1.src.main.java.pl.coderslab.bean;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    List<Customer> readCustomers();
}
