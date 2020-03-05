package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie51")
public class Cookie51 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("cookie51", "pierwszaWizyta");
        response.addCookie(cookie);
        response.getWriter().append("<a href=\"/d3/cookie52\">link do strony</a> <br>");
    }
}
