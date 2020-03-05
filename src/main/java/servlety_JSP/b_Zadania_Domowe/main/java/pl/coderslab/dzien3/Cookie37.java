package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rememberMe")
public class Cookie37 extends HttpServlet {
    private final String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"\" method=\"Post\">\n" +
            "    <label>\n" +
            "        name\n" +
            "        <input type=\"text\" name=\"name\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <label>\n" +
            "        Zapamiętaj mnie:\n" +
            "        <input type=\"checkbox\" name=\"rememberMe\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.getWriter().println("Cześć " + name);
        String rememberMe = request.getParameter("rememberMe");
        if (rememberMe != null) {
            Cookie cookie = new Cookie("name", name);
            response.addCookie(cookie);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String name = "";
        boolean emptyCookie = true;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("name")) {
                    name = c.getValue();
                    response.getWriter().println("cześć " + name + ". Twoje dane zostały wczytane z ciasteczka");
                    emptyCookie = false;
                }
            }
        }
        if (emptyCookie) {
            response.getWriter().println(FORM);
        }
    }
}