package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3.Basket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/servlet351")
public class Servlet351 extends HttpServlet {
    private final String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<form action=\"\" method=\"Post\">\n" +
            "    <label>\n" +
            "        Nazwa Produktu:\n" +
            "        <input type=\"text\" name=\"name\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <label>\n" +
            "        ilosc:\n" +
            "        <input type=\"number\" name=\"quantity\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <label>\n" +
            "        cena:\n" +
            "        <input type=\"number\" step=\"0.01\" name=\"price\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "<a href=\"/servlet352\">Koszyk zakupowy</a>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        Basket product = new Basket(request.getParameter("name"), Integer.parseInt(request.getParameter("quantity")), Double.parseDouble(request.getParameter("price")));
        Basket[] products = addProducts(session, product);
        session.setAttribute("basket", products);
        response.sendRedirect("/servlet351");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        if (session.getAttribute("basket") != null) {
            response.getWriter().println("Produkt dodany");
        }
        response.setContentType("text/html; utf-8");
        response.getWriter().println(FORM);
    }

    public static Basket[] addProducts(final HttpSession session, Basket basket) {
        Basket[] products = (Basket[]) session.getAttribute("basket");
        Basket[] newTable;
        if (products == null) {
            newTable = new Basket[1];
            newTable[0] = basket;
        } else {
            newTable = new Basket[products.length + 1];
            for (int i = 0; i < products.length; i++) {
                newTable[i] = products[i];
            }
            newTable[newTable.length - 1] = basket;
        }
        return newTable;
    }
}
