package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        char[] arrayOfNumbers = number.toCharArray();
        boolean calculation = true;
        for (char c : arrayOfNumbers) {
            if (c != '0' && c != '1') {
                calculation = false;
                response.getWriter().println("to nie jest liczba binarna");
            }
        }
        int sum =0;
        if (calculation) {
            for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
                if (arrayOfNumbers[i]=='1'){
                   sum+=  Math.pow(2,arrayOfNumbers.length-i-1);
                }
            }
            response.getWriter().println(sum);
        }
    }
}