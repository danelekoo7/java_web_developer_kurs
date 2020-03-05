package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet(name = "Servlet25",urlPatterns = "/servlet25")
public class Servlet25 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer[] arrayOfRandomNumbers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            arrayOfRandomNumbers[i]= random.nextInt(100)+1;
        }
        response.getWriter().println("wylosowane liczby");
        response.getWriter().println(Arrays.toString(arrayOfRandomNumbers));
        Arrays.sort(arrayOfRandomNumbers);
        response.getWriter().println("posortowane liczby");
        response.getWriter().println(Arrays.toString(arrayOfRandomNumbers));
    }
}