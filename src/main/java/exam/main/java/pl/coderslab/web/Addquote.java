package exam.main.java.pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addquote")
public class Addquote extends HttpServlet {

    String form = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"addquote\" method=\"Post\">\n" +
            "    <label>\n" +
            "        Imię i nazwisko autora\n" +
            "        <input type=\"text\" name=\"author\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <label>\n" +
            "        cytat:\n" +
            "        <input type=\"text\" name=\"content\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String author = request.getParameter("author");
        String content = request.getParameter("content");
        Quote quote = new Quote(author, content);
        List<Quote> quotes = getQuote(session);
        quotes.add(quote);
        session.setAttribute("quotes", quotes);

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<a href=\"/addquote\"> dodaj nowy</a><br>");
        response.getWriter().println("<a href=\"/allquotes\"> pokaż wszystkie</a><br>");
        response.getWriter().println("<a href=\"/randomquote\"> losowy</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(form);
    }

    public static List<Quote> getQuote(final HttpSession session) {
        List<Quote> quotes = (List<Quote>) session.getAttribute("quotes");
        if (quotes == null) {
            quotes = new ArrayList<>();
        }
        return quotes;
    }
}
