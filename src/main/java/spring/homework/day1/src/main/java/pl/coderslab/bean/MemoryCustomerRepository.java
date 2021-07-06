package spring.homework.day1.src.main.java.pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryCustomerRepository implements CustomerRepository {

    List<Customer> customers = new ArrayList<>();
    Customer customer;
    CustomerLogger customerLogger;

    @Autowired
    public MemoryCustomerRepository(@Qualifier("dBCustomerLogger") CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public CustomerLogger getCustomerLogger() {
        return customerLogger;
    }

    public void setCustomerLogger(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);

        customerLogger.log();

    }

    @Override
    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
        customerLogger.log();
    }

    @Override
    public List<Customer> readCustomers() {
        customers.forEach(System.out::println);
        customerLogger.log();
        return customers;
    }
}
