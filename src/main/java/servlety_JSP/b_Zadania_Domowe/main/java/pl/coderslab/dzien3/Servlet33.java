package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        session.setAttribute("pole1", request.getParameter("pole1"));
        session.setAttribute("pole2", request.getParameter("pole2"));
        session.setAttribute("pole3", request.getParameter("pole3"));
        session.setAttribute("pole4", request.getParameter("pole4"));
        session.setAttribute("pole5", request.getParameter("pole5"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        List<String> atr = getAttributes(session);
        String form = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form action=\"\" method=\"Post\">\n" +
                "    <label>\n" +
                "        pole 1:\n" +
                "        <input type=\"text\" name=\"pole1\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 2:\n" +
                "        <input type=\"text\" name=\"pole2\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 3:\n" +
                "        <input type=\"text\" name=\"pole3\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 4:\n" +
                "        <input type=\"text\" name=\"pole4\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 5:\n" +
                "        <input type=\"text\" name=\"pole5\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <input type=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";


        String form2 = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"\" method=\"Post\">\n" +
                "    <label>\n" +
                "        pole 1:\n" +
                "        <input type=\"text\" name=\"pole1\" value=\"pole1Value\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 2:\n" +
                "        <input type=\"text\" name=\"pole2\" value=\"pole2Value\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 3:\n" +
                "        <input type=\"text\" name=\"pole3\" value=\"pole3Value\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 4:\n" +
                "        <input type=\"text\" name=\"pole4\" value=\"pole4Value\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        pole 5:\n" +
                "        <input type=\"text\" name=\"pole5\" value=\"pole5Value\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <input type=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        if (session.getAttribute("pole1") != null ||
                session.getAttribute("pole2") != null ||
                session.getAttribute("pole3") != null ||
                session.getAttribute("pole4") != null ||
                session.getAttribute("pole5") != null) {
            String operation1 = form2.replace("pole1Value", (CharSequence) session.getAttribute("pole1"));
            String operation2 = operation1.replace("pole2Value", (CharSequence) session.getAttribute("pole2"));
            String operation3 = operation2.replace("pole3Value", (CharSequence) session.getAttribute("pole3"));
            String operation4 = operation3.replace("pole4Value", (CharSequence) session.getAttribute("pole4"));
            String operation5 = operation4.replace("pole5Value", (CharSequence) session.getAttribute("pole5"));
            response.getWriter().println(operation5);
        } else {
            response.getWriter().println(form);
        }
    }

    public static List<String> getAttributes(final HttpSession session) {
        List<String> attributes = (List<String>) session.getAttribute("attributes");
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return attributes;
    }
}
