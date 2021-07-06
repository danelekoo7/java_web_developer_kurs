package servlety_JSP.a_Zadania.a_Dzien_4.main.java.pl.coderslab.JSTL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Book> listOfBooks = new ArrayList<>();
        Book book1 = new Book("awsome","adam","a1");
        Book book2 = new Book("bad","bartek","b2");

        listOfBooks.add(book1);
        listOfBooks.add(book2);

        request.setAttribute("ksiazki", listOfBooks);
        getServletContext().getRequestDispatcher("/resultList.jsp").forward(request, response);

    }
}
