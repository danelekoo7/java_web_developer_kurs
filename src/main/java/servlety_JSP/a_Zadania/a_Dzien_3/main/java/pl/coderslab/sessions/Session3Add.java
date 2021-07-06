package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {
    private final static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Klucz:\n" +
            "        <input type=\"text\" name=\"key\">\n" +
            "    </label>\n" +
            "<br> " +
            "    <label>\n" +
            "        Wartość:\n" +
            "        <input type=\"text\" name=\"value\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; utf-8");
        response.getWriter().println(FORM);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        final String key = request.getParameter("key");
        final String value = request.getParameter("value");
        final List<String> attributes = getAttributes(session);
        if (!attributes.contains(key)) {
            attributes.add(key);
            session.setAttribute("attributes", attributes);
        }
        session.setAttribute(key, value);
    }

    public static List<String> getAttributes(final HttpSession session) {
        List<String> attributes = (List<String>) session.getAttribute("attributes");
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return attributes;
    }
}
