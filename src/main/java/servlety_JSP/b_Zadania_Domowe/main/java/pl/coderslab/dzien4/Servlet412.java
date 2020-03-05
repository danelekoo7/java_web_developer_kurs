package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet412")
public class Servlet412 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String selectedLanguage = request.getParameter("lang");
        Cookie language = new Cookie("language", selectedLanguage);
        response.addCookie(language);
        response.sendRedirect("/servlet411");
    }
}
