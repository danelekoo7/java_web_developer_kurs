package bazy_danych.b_Zadania_domowe.a_Dzien_2;


import bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main4 {
    public static void main(String[] args) {
        String query = "SELECT title, description, rating, name, address\n" +
                "FROM movies\n" +
                "         JOIN cinemas_movies cm on movies.id = cm.movie_id\n" +
                "         JOIN cinemas c on cm.cinema_id = c.id;";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preStmt =
                    conn.prepareStatement(query);
            ResultSet rs = preStmt.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                String description = rs.getString("description");
                double rating = rs.getDouble("rating");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println(title + " " + description + " " + rating + " " + name + " " + address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}