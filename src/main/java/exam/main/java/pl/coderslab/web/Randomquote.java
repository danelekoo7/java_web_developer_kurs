package exam.main.java.pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import static exam.main.java.pl.coderslab.web.Addquote.getQuote;

@WebServlet("/randomquote")
public class Randomquote extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = getQuote(session);
        Random random = new Random();
        int r = random.nextInt(quotes.size());
        List<Quote> quote = quotes.subList(r, r + 1);
        request.setAttribute("quotes", quote);
        getServletContext().getRequestDispatcher("/quotes.jsp")
                .forward(request, response);
    }
}
