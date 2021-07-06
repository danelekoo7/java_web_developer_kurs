package servlety_JSP.a_Zadania.a_Dzien_4.main.java.pl.coderslab.JSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletAddCookie")
public class ServletAddCookie extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie newCookie = new Cookie("foo", "bar");
        response.addCookie(newCookie);
    }
}
