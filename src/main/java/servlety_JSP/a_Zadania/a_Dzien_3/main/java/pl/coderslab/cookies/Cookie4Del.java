package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeCookie")
public class Cookie4Del extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String name = request.getParameter("name");
        for (Cookie c : cookies) {
            if (c.getName().equals(name)) {
                c.setMaxAge(0);
                response.addCookie(c);
            }
        }
    }
}