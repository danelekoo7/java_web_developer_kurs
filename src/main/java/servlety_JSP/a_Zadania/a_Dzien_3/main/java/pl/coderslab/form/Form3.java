package servlety_JSP.a_Zadania.a_Dzien_3.main.java.pl.coderslab.form;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/get3")
public class Form3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("page");

        response.getWriter().println(number);


        int num = 1;

        List<Integer> numbersList = new ArrayList<>();

        try {
            num = Integer.parseInt(number);
        } catch (Exception e) {
            response.getWriter().println("to nie jest liczba calkowita");
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numbersList.add(i);
            }
        }


        response.getWriter().println("dzielniki liczby " + num + " to " + numbersList);

    }
}
