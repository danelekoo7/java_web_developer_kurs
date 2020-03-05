package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet36")
public class Servlet36 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num[] = request.getParameterValues("num");
        double sum = 0;
        double ratio = 1;
        response.getWriter().println("Liczby:");
        for (int i = 0; i < num.length; i++) {
            response.getWriter().println("\t- " + num[i]);
            sum += Double.parseDouble(num[i]);
            ratio *= Double.parseDouble(num[i]);
        }
        response.getWriter().println("Srednia: \n\t - " + (sum / num.length));
        response.getWriter().println("Suma: \n\t - " + sum);
        response.getWriter().println("Iloczyn: \n\t - " + ratio);
    }
}