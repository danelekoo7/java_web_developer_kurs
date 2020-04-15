package spring.homework.day1.src.main.java.pl.coderslab.bean;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + ": Customer operation");
    }
}
