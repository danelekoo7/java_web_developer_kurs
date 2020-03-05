package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAllSessions")
public class Session3All extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        List<String> attributes = (List<String>) Session3Add.getAttributes(session);

        for (String key : attributes) {
            final String value = (String) session.getAttribute(key);
            response.getWriter().println(key + " - " + value);

        }
    }
}
