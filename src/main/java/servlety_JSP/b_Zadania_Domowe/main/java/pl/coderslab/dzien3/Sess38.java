package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/sess38")
public class Sess38 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Integer firstNumber = (Integer) session.getAttribute("firstNumber");
        Integer secondNumber = (Integer) session.getAttribute("secondNumber");

        if (firstNumber + secondNumber == Integer.valueOf(request.getParameter("add"))) {
            response.getWriter().println(firstNumber + " + " + secondNumber + " = " + request.getParameter("add") + " Correct");
        } else {
            response.getWriter().println(firstNumber + " + " + secondNumber + " = " + request.getParameter("add") + " Wrong");
        }

        if (firstNumber - secondNumber == Integer.valueOf(request.getParameter("sub"))) {
            response.getWriter().println(firstNumber + " - " + secondNumber + " = " + request.getParameter("sub") + " Correct");
        } else {
            response.getWriter().println(firstNumber + " - " + secondNumber + " = " + request.getParameter("sub") + " Wrong");
        }

        if (firstNumber * secondNumber == Integer.valueOf(request.getParameter("multi"))) {
            response.getWriter().println(firstNumber + " * " + secondNumber + " = " + request.getParameter("multi") + " Correct");
        } else {
            response.getWriter().println(firstNumber + " * " + secondNumber + " = " + request.getParameter("multi") + " Wrong");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Random r = new Random();

        Integer firstNumber = r.nextInt((1001 - 20)) + 20;
        Integer secondNumber = r.nextInt((1001 - 20)) + 20;

        session.setAttribute("firstNumber", firstNumber);
        session.setAttribute("secondNumber", secondNumber);

        String form = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"\" method=\"Post\">\n" +
                "    <label>\n" +
                "        firstNumber + secondNumber =  \n" +
                "        <input type=\"number\" name=\"add\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        firstNumber - secondNumber =\n" +
                "        <input type=\"number\" name=\"sub\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        firstNumber * secondNumber =\n" +
                "        <input type=\"number\" name=\"multi\">\n" +
                "    </label>\n" +
                "    <input type=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";

        String operation1 = form.replace("firstNumber", firstNumber.toString());
        String operation2 = operation1.replace("secondNumber", secondNumber.toString());

        response.getWriter().println(operation2);
    }
}
