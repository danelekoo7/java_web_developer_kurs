package bazy_danych.b_Zadania_domowe.a_Dzien_2;


import bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("Podaj nazwę kina: ");
        Scanner scanner = new Scanner(System.in);
        String cinemaName = scanner.nextLine();
        String query = "SELECT title\n" +
                "FROM cinemas\n" +
                "         RIGHT JOIN cinemas_movies cm on cinemas.id = cm.cinema_id\n" +
                "         RIGHT JOIN movies m on cm.movie_id = m.id\n" +
                "WHERE name='aabb';";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(query.replace("aabb", cinemaName));
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(cinemaName + " :");
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                System.out.println("* " + title);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}