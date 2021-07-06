package spring.homework.day1.src.main.java.pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class FileCustomerLogger implements CustomerLogger {

    String fileName;

    @Autowired
    public FileCustomerLogger(@Value("log11.txt") String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log() {
        String str = LocalDateTime.now() + ": new method \n";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(str);
            writer.close();
            System.out.println("zapisano nowy log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}