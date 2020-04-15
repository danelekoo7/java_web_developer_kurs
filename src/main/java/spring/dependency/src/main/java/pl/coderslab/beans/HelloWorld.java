package spring.dependency.src.main.java.pl.coderslab.beans;

public class HelloWorld {

    private String message;

//    public HelloWorld(String message) {
//        this.message = message;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }
}
