package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.*;
import java.util.Arrays;

public class DBUtil {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/products_ex?useSSL=false&characterEncoding=utf8";
    public static final String PRODUCTS_EX = "jdbc:mysql://localhost:3306/products_ex?useSSL=false&characterEncoding=utf8";
    public static final String CINEMAS_EX = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8";


    public static final String DB_USER = "root";
    public static final String DB_PASS = "coderslab";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public static Connection getCinemasConnection() throws SQLException {
        return DriverManager.getConnection(CINEMAS_EX, DB_USER, DB_PASS);
    }

    public static Connection getProductsConnection() throws SQLException {
        return DriverManager.getConnection(PRODUCTS_EX, DB_USER, DB_PASS);
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

    public static void printData(Connection conn, String query, String... params) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                for (String param : params) {
                    System.out.println(resultSet.getString(param));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";

    public static void remove(Connection conn, String tableName, int id) {
        try (PreparedStatement statement =
                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final String AVG_QUERY = "SELECT AVG(rating) FROM movies";

    public static double avg(Connection conn, String query) {
        double average = -999999999;
        try (PreparedStatement statement =
                     conn.prepareStatement(query);) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                average = resultSet.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return average;
    }

    public static void showAllCinemas() {
        try (Connection conn = DBUtil.getCinemasConnection()) {
            Statement stmt =
                    conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cinemas");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println(id + " " + name + " " + address + " ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cienamasEdition(int id, String name, String address) {
        try (Connection conn = getCinemasConnection()) {
            PreparedStatement preStmt =
                    conn.prepareStatement("UPDATE cinemas SET name= ? , address = ? WHERE id = ?");
            preStmt.setString(1, name);
            preStmt.setString(2, address);
            preStmt.setInt(3, id);
            preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cienamasDelete(int id) {
        try (Connection conn = getCinemasConnection()) {
            PreparedStatement preStmt =
                    conn.prepareStatement("DELETE\n" +
                            "FROM cinemas\n" +
                            "WHERE id = ?;");
            preStmt.setInt(1, id);
            preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}