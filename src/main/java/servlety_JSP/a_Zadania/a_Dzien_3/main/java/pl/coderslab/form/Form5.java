package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double temperature = Double.parseDouble(request.getParameter("degrees"));
        Double temperatureAfterChanges = null;
        if (request.getParameter("convertionType").equals("celcToFahr")) {
            temperatureAfterChanges = (temperature * 9 / 5) + 32;
        } else if (request.getParameter("convertionType").equals("FahrToCelc")) {
            temperatureAfterChanges = (temperature - 32) * 5 / 9;
        }
        response.getWriter().println(temperatureAfterChanges);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
