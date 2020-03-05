package exam.main.java.pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/regex")
public class Regex extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name =request.getParameter("param1");
        String regex = "[a-z]+\\.(jpg|gif|png)";
        String url = "https://www.google.pl/#q=cat.jpg";

        if (name.matches(regex)){
            String wwwSite = url.replace("cat.jpg",name);
            response.sendRedirect(wwwSite);
        } else {
            response.getWriter().println("Niepoprawna nazwa");
        }
    }
}
