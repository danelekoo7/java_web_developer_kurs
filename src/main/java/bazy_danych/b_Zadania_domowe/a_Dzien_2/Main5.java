package bazy_danych.b_Zadania_domowe.a_Dzien_2;


import bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main5 {
    public static void main(String[] args) {
        String query = "SELECT name, title, show_time\n" +
                "FROM cinemas\n" +
                "         LEFT JOIN cinemas_movies cm on cinemas.id = cm.cinema_id\n" +
                "         LEFT JOIN movies m on cm.movie_id = m.id\n" +
                "         LEFT JOIN screenings s on cinemas.id = s.cinema_id;\n";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preStmt =
                    conn.prepareStatement(query);
            ResultSet rs = preStmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String title = rs.getString("title");
                String showTime = rs.getString("show_time");
                System.out.println(name + " " + title + " " + showTime);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
