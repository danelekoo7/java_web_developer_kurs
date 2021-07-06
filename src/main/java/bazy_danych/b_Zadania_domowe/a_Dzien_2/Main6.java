package bazy_danych.b_Zadania_domowe.a_Dzien_2;


import bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        System.out.println("Podaj nazwę filmu");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        String query = "SELECT title,description,rating\n" +
                "FROM movies\n" +
                "WHERE title = 'aabbcc';";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preStmt =
                    conn.prepareStatement(query.replace("aabbcc", name));
            ResultSet rs = preStmt.executeQuery();
            boolean movieNotFound = true;
            while (rs.next()) {
                String title = rs.getString("title");
                String description = rs.getString("description");
                double rating = rs.getDouble("rating");
                System.out.println(title + " " + description + " " + rating);
                movieNotFound = false;
            }
            if (movieNotFound) {
                System.out.println("Nie odnaleziono filmu");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
