package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Double a = stringToDouble(request.getParameter("a"));
        Double b = stringToDouble(request.getParameter("b"));
        Double c = stringToDouble(request.getParameter("c"));

        Double delta = (b * b) - (4 * a * c);

        if (delta > 0) {

            response.getWriter().println("x1= " + (-b - Math.sqrt(delta)) / (2 * a));
            response.getWriter().println("x2= " + (-b + Math.sqrt(delta)) / (2 * a));
        } else if (delta == 0) {
            response.getWriter().println("x= " + (-b + Math.sqrt(delta)) / (2 * a));

        } else {
            response.getWriter().println("brak rozwiązań");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public Double stringToDouble(String s) {
        try {
            return Double.valueOf(s);
        } catch (Exception e) {
            return 0.0;
        }
    }
}
