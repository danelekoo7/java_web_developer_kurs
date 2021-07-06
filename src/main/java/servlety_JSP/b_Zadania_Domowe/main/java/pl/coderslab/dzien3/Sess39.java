package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@WebServlet("/sess39")
public class Sess39 extends HttpServlet {
    public final Country[] countries = {new Country("niemcy", "berlin"),
            new Country("czechy", "praga"),
            new Country("slowacja", "bratyslawa"),
            new Country("ukraina", "kijow"),
            new Country("bialorus", "minsk"),
            new Country("litwa", "wilno"),
            new Country("rosja", "moskwa")};

    public final String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Podaj stolicę dla państwa: countryName\n" +
            "        <input type=\"text\" name=\"result\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        Integer correctAnswer = (Integer) session.getAttribute("correctAnswer");

        response.setCharacterEncoding("UTF-8");

        if (request.getParameter("result").equals(countries[counter].getCapital())) {
            session.setAttribute("correctAnswer", correctAnswer+1);
        }
        counter += 1;
        session.setAttribute("counter", counter);

        if (counter < 7) {
            response.setContentType("text/html");
            String operation = FORM.replace("countryName", countries[counter].getCountry());
            response.getWriter().println(operation);
        } else {
            response.getWriter().println("Poprawnych odpowiedzi: " + session.getAttribute("correctAnswer"));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("counter", 0);
        session.setAttribute("correctAnswer", 0);
        response.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String operation = FORM.replace("countryName", countries[0].getCountry());
        response.getWriter().println(operation);
    }
}
