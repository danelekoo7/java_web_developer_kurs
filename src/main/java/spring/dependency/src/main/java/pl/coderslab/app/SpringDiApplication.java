package spring.dependency.src.main.java.pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dependency.src.main.java.pl.coderslab.beans.EmailService;
import spring.dependency.src.main.java.pl.coderslab.beans.HelloWorld;
import spring.dependency.src.main.java.pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.printMessage();

        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.send();

        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();

        context.close();
    }
}
