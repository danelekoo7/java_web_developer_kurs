package servlety_JSP.a_Zadania.a_Dzien_4.main.java.pl.coderslab.filtry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {

    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");


        HttpSession sess = request.getSession();

        if (user.equals(USER) && pass.equals(PASSWORD)) {

            // dodaj dane do sesji pod kluczem: username

            sess.setAttribute("username", user);
            // przekieruj na adres /admin
            response.sendRedirect(request.getContextPath() + "/admin");

        } else {
            // wyświetl informacje o błędnych danych
            response.getWriter().println("błędne dane");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

    }
}
