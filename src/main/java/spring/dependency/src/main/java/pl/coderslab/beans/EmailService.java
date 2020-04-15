package spring.dependency.src.main.java.pl.coderslab.beans;

public class EmailService implements MessageService {
    @Override
    public void send() {
        System.out.println("Sending email");
    }
    @Override
    public void send(String message) {
        System.out.println("email service implement " + message);
    }
}
