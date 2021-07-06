package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {

    final double EURO_USD = 1.11;
    final double USD_EURO = 0.90;
    final double EURO_PLN = 4.30;
    final double PLN_EURO = 0.23;
    final double USD_PLN = 3.88;
    final double PLN_USD = 0.26;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double amount = Double.valueOf(request.getParameter("amount"));
        String calcualteType = request.getParameter("calculateType");
        if (calcualteType.equals("euroUsd")) {
            response.getWriter().println(amount * EURO_USD);
        } else if (calcualteType.equals("usdEuro")) {
            response.getWriter().println(amount * USD_EURO);
        } else if (calcualteType.equals("euroPln")) {
            response.getWriter().println(amount * EURO_PLN);
        } else if (calcualteType.equals("plnEuro")) {
            response.getWriter().println(amount * PLN_EURO);
        } else if (calcualteType.equals("usdPln")) {
            response.getWriter().println(amount * USD_PLN);
        } else if (calcualteType.equals("plnUsd")) {
            response.getWriter().println(amount * PLN_USD);
        } else {
            response.getWriter().println("cos nie działa");
        }
    }
}
