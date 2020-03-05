package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3.Basket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/servlet352")
public class Servlet352 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        Basket[] products = (Basket[]) session.getAttribute("basket");
        if (products == null) {
            response.getWriter().println("koszyk jest jeszcze pusty");
        } else {
            double total = 0;
            for (Basket b : products) {
                double sum = b.getPrice() * b.getQuantity();
                total += sum;
                response.getWriter().println(b.getName() + " - " + b.getQuantity() + " x " + b.getPrice() +
                        "zl = " + sum);
            }
            response.getWriter().println("\t razem: " + total);
        }
    }
}
