package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien4;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebServlet("/guestbook")
public class Guestbook extends HttpServlet {
    String showOpinionsQuery = "SELECT * FROM opinion ORDER BY create_time DESC LIMIT ?;";
    String addOpinionsQuery = "INSERT INTO opinion (name, description, create_time) values (?,?,?);";
    String addOpinionForm = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"\" method=\"Post\">\n" +
            "    <label>\n" +
            "        Podaj tytul\n" +
            "        <input type=\"text\" name=\"title\" value=\"tytul\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <label>\n" +
            "        Napisz opinie\n" +
            "        <input type=\"text\" name=\"opinion\" value=\"opinia\">\n" +
            "    </label>\n" +
            "    <br>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String url = (String) session.getAttribute("url");
        String pass = (String) session.getAttribute("pass");
        String user = (String) session.getAttribute("user");
        String title = request.getParameter("title");
        String opinion = request.getParameter("opinion");
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        boolean connection = true;
        while (connection) {
            try (Connection conn = DriverManager.getConnection(
                    url, user, pass)) {
                connection = false;
                PreparedStatement prepStm = conn.prepareStatement(addOpinionsQuery);
                prepStm.setString(1, title);
                prepStm.setString(2, opinion);
                prepStm.setTimestamp(3, currentTime);
                prepStm.executeUpdate();
                doGet(request, response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String DB_USER = getServletContext().getInitParameter("user");
        final String DB_PASS = getServletContext().getInitParameter("pass");
        final String DB_URL = getServletContext().getInitParameter("url");

        HttpSession session = request.getSession();
        session.setAttribute("user", DB_USER);
        session.setAttribute("pass", DB_PASS);
        session.setAttribute("url", DB_URL);

        int opinionLimit = Integer.valueOf(getServletContext().getInitParameter("opinionLimit"));
        boolean connection = true;

        response.setContentType("text/html");
        response.getWriter().println(addOpinionForm);

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        while (connection) {
            try (Connection conn = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASS)) {
                connection = false;
                PreparedStatement prepStm = conn.prepareStatement(showOpinionsQuery);
                prepStm.setInt(1, opinionLimit);
                ResultSet rs = prepStm.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    response.getWriter().println("<br>" + name + "<br>" + description + "<br><br>");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}