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

@WebServlet("/session4")
public class Session4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final HttpSession session = request.getSession();

        final String name = request.getParameter("name");
        final Integer quantity = Integer.valueOf(request.getParameter("quantity"));
        final Double price = Double.valueOf(request.getParameter("price"));

        CartItem cartItem = new CartItem(name, quantity, price);

        List<CartItem> cartItems = getCartItems(session);
        cartItems.add(cartItem);

        session.setAttribute("cartItems", cartItems);

        double total = 0;
        for (CartItem item : cartItems) {
            total += (item.getQuantity() * item.getPrice());
            response.getWriter().println(item.getName() + " - " +
                    item.getQuantity() + " x " +
                    item.getPrice() + "zl = " +
                    (item.getQuantity() * item.getPrice()) +
                    "zl");
        }
        response.getWriter().println("\t\tSuma: " + total + "zl");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public static List<CartItem> getCartItems(final HttpSession session) {
        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }
        return cartItems;
    }
}
