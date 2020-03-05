package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet411")
public class Servlet411 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");
        HttpSession session = request.getSession();
        boolean noLanguageSelected = true;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("language")) {
                    response.getWriter().println(lang.get(c.getValue()));
                    noLanguageSelected = false;
                }
            }
        }
        if (noLanguageSelected && session.isNew()) {
            response.sendRedirect("/index411.jsp");
        } else if (noLanguageSelected && !session.isNew()) {
            response.getWriter().println(lang.get("pl"));
        }
    }
}
