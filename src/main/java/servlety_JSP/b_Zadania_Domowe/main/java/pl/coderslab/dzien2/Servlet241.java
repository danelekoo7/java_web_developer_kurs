package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet241", urlPatterns = "/servlet241")
public class Servlet241 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=0\">zerowy produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=1\">pierwszy produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=2\">drugi produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=3\">trzeci produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=4\">czwarty produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=5\">piaty produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=6\">szosty produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=7\">siodmy produkt</a> <br>");
        response.getWriter().append("<a href=\"http://localhost:8080/servlet242?id=8\">blad</a>");
    }
}
