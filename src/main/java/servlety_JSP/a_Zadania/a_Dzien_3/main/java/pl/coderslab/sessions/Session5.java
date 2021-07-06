package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/session5")
public class Session5 extends HttpServlet {

    private final static String BEFORE_CAPTCHA = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"\" method=\"POST\">\n" +
            "<label>\n" +
            "        imie:\n" +
            "        <input type=\"text\" name=\"imie\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Nazwisko:\n" +
            "        <input type=\"text\" name=\"nazwisko\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Email:\n" +
            "        <input type=\"text\" name=\"email\">\n" +
            "    </label>\n" +
            "    <label>";

    private final static String AFTER_CAPTCHA =
            "        <input type=\"number\" name=\"wynik\">\n" +
                    "    </label>\n" +
                    "    <input type=\"submit\">\n" +
                    "</form>\n" +
                    "</body>\n" +
                    "</html>";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();

        String name = request.getParameter("imie");
        String surname = request.getParameter("nazwisko");
        String email = request.getParameter("email");
        int result = Integer.valueOf(request.getParameter("wynik"));

        if (result == (Integer) session.getAttribute("captcha")) {
            response.getWriter().println("Super");
        } else {
            response.getWriter().println("Zle");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);

        final HttpSession session = request.getSession();
        session.setAttribute("captcha", num1 + num2);

        response.setContentType("text/html; utf-8");
        response.getWriter().println(BEFORE_CAPTCHA + "Wpisz ponizej sume " + num1 + " + " + num2 + AFTER_CAPTCHA);
    }
}
