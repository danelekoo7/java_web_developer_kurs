package exam.main.java.pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class Homepage extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String accept = request.getParameter("acceptCookie");
        Cookie acceptCookie = new Cookie("acceptCookie", "false");
        if (accept != null && accept.equals("true")) {
            acceptCookie.setValue("true");
        }
        response.addCookie(acceptCookie);
        Cookie[] cookies = request.getCookies();

        boolean acceptBoolean = false;
        for (Cookie c : cookies) {
            if (c.getName().equals("acceptCookie")) {
                if (c.getValue().equals("true")) {
                    acceptBoolean = true;
                }
            }
        }

        if (!acceptBoolean) {
            response.getWriter().println("Informujemy, że ta strona korzysta z plików cookies. <br>");
            response.getWriter().println("<a href=\"/homepage?acceptCookie=true\"> akceptuj cookie</a><br>");
        }
        response.getWriter().println("Strona WWW");
    }
}
