package servlety_JSP.a_Zadania.a_Dzien_4.main.java.pl.coderslab.JSTL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String title = request.getParameter("title");
        final String author = request.getParameter("author");
        final String isbn = request.getParameter("isbn");
        Book book = new Book(title, author, isbn);
        request.setAttribute("ksiazka", book);
        getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
    }


}