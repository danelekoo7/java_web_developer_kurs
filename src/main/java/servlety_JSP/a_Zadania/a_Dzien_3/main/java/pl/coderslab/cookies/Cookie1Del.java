package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.cookies;

import servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.cookies.Cookie1Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Cookie user = Cookie1Get.getCookieUser(request.getCookies());
        if (user != null) {
            user.setMaxAge(0);
            response.addCookie(user);
        } else {
            response.getWriter().println("Brak");
        }
    }
}