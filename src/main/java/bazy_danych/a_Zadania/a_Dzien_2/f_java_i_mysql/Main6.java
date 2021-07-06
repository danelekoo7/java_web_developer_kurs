package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main6 {

    public static void main(String[] args) {
        String query = "SELECT AVG(rating) FROM movies";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preStmt =
                    conn.prepareStatement("SELECT * FROM movies WHERE rating > ?");
            preStmt.setDouble(1, DBUtil.avg(conn, query));
            ResultSet rs = preStmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                double rating = rs.getDouble("rating");
                System.out.println(id + " " + title + " " + description + " " + rating);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}