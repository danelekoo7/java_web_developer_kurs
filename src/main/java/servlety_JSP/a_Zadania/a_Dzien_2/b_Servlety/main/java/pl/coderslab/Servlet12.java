package servlety_JSP.a_Zadania.a_Dzien_2.b_Servlety.main.java.pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet12")
public class Servlet12 extends HttpServlet {


    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        response.getWriter().append("Content12");
    }
}
