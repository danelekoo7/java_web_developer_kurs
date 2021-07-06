package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie user = getCookieUser(request.getCookies());
        if (user!=null){
            response.getWriter().println("User: " + user.getValue());
        } else {
            response.getWriter().println("Brak ciasteczka");
        }
    }

    public static Cookie getCookieUser(final Cookie[] cookies) {
        Cookie user = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("User")) {
                    user = cookie;
                }
            }
        }
        return user;
    }
}
