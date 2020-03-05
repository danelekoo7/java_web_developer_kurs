package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien2;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "Servlet23", urlPatterns = "/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (InputStream in = new FileInputStream("/home/daniel/Kurs/KAT_JEE_W_04_Servlety/b_Zadania_Domowe/a_Dzien_2/jee-servlet/oop.txt")) {
            response.getWriter().println(IOUtils.toString(in, "UTF-8"));
        }
    }
}