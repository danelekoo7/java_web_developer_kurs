package bazy_danych.b_Zadania_domowe.a_Dzien_2;


import bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        String allCinemas = "SELECT * FROM cinemas;";
        try (Connection connection = DBUtil.getCinemasConnection()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(allCinemas);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                System.out.println(id + " " + name + " " + address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        boolean loop = true;
        int cId = -1;
        while (loop) {
            System.out.println("\nPodaj id kina: ");
            Scanner scanner = new Scanner(System.in);
            String cinemaId = scanner.nextLine();
            try {
                cId = Integer.parseInt(cinemaId);
                loop = false;
            } catch (Exception e) {
                System.out.println("\npodaj poprawną liczbę");
            }
        }
        String query = "SELECT m.id, title, description, rating\n" +
                "FROM cinemas\n" +
                "         JOIN cinemas_movies cm on cinemas.id = cm.cinema_id\n" +
                "         JOIN movies m on cm.movie_id = m.id\n" +
                "WHERE cinemas.id = ?;";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, cId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                double rating = resultSet.getDouble("rating");
                System.out.println(id + " " + title + " " + description + " " + rating);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        boolean loopMovie = true;
        int mId = -1;
        while (loopMovie) {
            System.out.println("\nPodaj id filmu: ");
            Scanner scanner = new Scanner(System.in);
            String movieId = scanner.nextLine();
            try {
                mId = Integer.parseInt(movieId);
                loopMovie = false;
            } catch (Exception e) {
                System.out.println("podaj poprawną liczbę");
            }
        }
        String queryMovie = "SELECT m.id, title, show_time\n" +
                "FROM cinemas\n" +
                "         JOIN cinemas_movies cm on cinemas.id = cm.cinema_id\n" +
                "         JOIN movies m on cm.movie_id = m.id\n" +
                "         JOIN screenings s on cinemas.id = s.cinema_id\n" +
                "WHERE m.id =  ? \n" +
                "  AND cinemas.id =  ?;";
        try (Connection conn = DBUtil.getCinemasConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(queryMovie);
            preparedStatement.setInt(1, mId);
            preparedStatement.setInt(2, cId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String showTime = resultSet.getString("show_time");
                System.out.println(id + " " + title + " " + showTime);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
