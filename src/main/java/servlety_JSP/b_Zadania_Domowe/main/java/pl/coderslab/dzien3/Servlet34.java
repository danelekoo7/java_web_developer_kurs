package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean cookieExist = false;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("visits".equals(c.getName())) {
                    cookieExist = true;
                    response.getWriter().println("Witaj, odwiedziłeś nas już " + c.getValue() + " razy");
                    Integer visitCounter = Integer.parseInt(c.getValue()) + 1;
                    Cookie cookie = new Cookie("visits", visitCounter.toString());
                    cookie.setMaxAge(60 * 60 * 24 * 365);
                    response.addCookie(cookie);
                }
            }

            if (!cookieExist) {
                response.getWriter().println("Witaj pierwszy raz na naszej stronie");
                Cookie cookie = new Cookie("visits", "1");
                cookie.setMaxAge(60 * 60 * 24 * 365);
                response.addCookie(cookie);
            } else {
            }
        }
    }
}
