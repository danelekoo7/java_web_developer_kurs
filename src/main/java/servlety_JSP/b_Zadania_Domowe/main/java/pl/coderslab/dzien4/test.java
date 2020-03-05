package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien4;//package pl.coderslab.dzien4;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class test {
//    public static void main(String[] args) {
//
//        String email = "fdxgdfx";
//        String name = "sdx";
//        String addOpinionsQuery = "INSERT INTO opinion (name, description, create_time) values (?,?,?);";
//
//
//        try (Connection conn = DriverManager.getConnection(
//                DB_URL, "root", "coderslab")) {
////            response.getWriter().println("jestem w polaczeniu");
//            PreparedStatement prepStm = conn.prepareStatement(addOpinionForm);
//            prepStm.setString(1, title);
//            response.getWriter().println("jestem w polaczeniu2");
//            prepStm.setString(2, opinion);
//            prepStm.setTimestamp(3, currentTime);
//            prepStm.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
////        try (Connection conn = getNewsletterConnection()) {
////            insert(conn, "INSERT INTO users(user_name, user_email) VALUES (?,?)",name,email);
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
//    }
//
//    public static final String DB_URL = "jdbc:mysql://localhost:3306/guest_book?useSSL=false&characterEncoding=utf8";
//
//    public static Connection getNewsletterConnection() throws SQLException {
//        return DriverManager.getConnection(DB_URL, "root", "coderslab");
//    }
//
//    public static void insert(Connection conn, String query, String... params) {
//        try (PreparedStatement statement = conn.prepareStatement(query)) {
//            for (int i = 0; i < params.length; i++) {
//                statement.setString(i + 1, params[i]);
//            }
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
