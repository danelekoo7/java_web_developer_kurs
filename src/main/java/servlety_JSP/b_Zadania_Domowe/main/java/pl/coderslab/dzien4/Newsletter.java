package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/newsletter")
public class Newsletter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");


        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = getNewsletterConnection()) {
            insert(conn, "INSERT INTO users(user_name, user_email) VALUES (?,?)",name,email);
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String form = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form action=\"\" method=\"Post\">\n" +
                "    <label>\n" +
                "        podaj email:\n" +
                "        <input type=\"text\" name=\"email\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <label>\n" +
                "        podaj imię:\n" +
                "        <input type=\"text\" name=\"name\">\n" +
                "    </label>\n" +
                "    <br>\n" +
                "    <input type=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";

        response.getWriter().println(loremIpsum);
        Cookie[] cookies = request.getCookies();

        boolean visit = true;
        for (Cookie c : cookies) {
            if (c.getName().equals("visit")) {
                visit = false;
            }
        }
        if (visit) {
            Cookie cookie = new Cookie("visit", "true");
            cookie.setMaxAge(10);
            response.addCookie(cookie);
            response.setContentType("text/html");
            response.getWriter().println(form);
        }
    }

    public static final String DB_URL = "jdbc:mysql://localhost:3306/newsletter?useSSL=false&characterEncoding=utf8";

    public static Connection getNewsletterConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, "root", "coderslab");
    }

    public static void insert(Connection conn, String query, String... params) {
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
