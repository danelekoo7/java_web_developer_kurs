package servlety_JSP.a_Zadania.a_Dzien_2.c_Get.main.java.pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get4", urlPatterns = "/get4")
public class Get4 extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        final String company = request.getParameter("company");
        final String[] languages = request.getParameterValues("learn");

        response.getWriter().println("company:");
        response.getWriter().println("  " + company);

        response.getWriter().println("learns: ");
        for (String language : languages){
            response.getWriter().println("  " + language);
        }
    }
}
