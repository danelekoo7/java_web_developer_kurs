package exam.main.java.pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static exam.main.java.pl.coderslab.web.Addquote.getQuote;

@WebServlet("/allquotes")
public class Allquotes extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = getQuote(session);
        request.setAttribute("quotes", quotes);
        getServletContext().getRequestDispatcher("/quotes.jsp")
                .forward(request, response);
    }
}
