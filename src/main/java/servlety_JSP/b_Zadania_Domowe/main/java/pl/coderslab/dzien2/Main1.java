package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien2;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {
    public static void main(String[] args) throws IOException {
        readUsingIOUtils();
    }
    public static void readUsingIOUtils() throws IOException {
        try(InputStream in = new FileInputStream("oop.txt")) {
            System.out.println( IOUtils.toString( in , "UTF-8") );
        }
    }

}
