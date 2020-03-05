package bazy_danych.exam;

import java.sql.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("podaj id uzytkownika");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String query = "SELECT * FROM users WHERE id=" + number;
        String query2 = "SELECT * FROM orders WHERE user_id =" + number;

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam2?useSSL=false&characterEncoding=utf8",
                "root", "coderslab");
             Statement stat = conn.createStatement()) {
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String pass = rs.getString("password");
                int id = rs.getInt("id");
                System.out.println(id + " " + name + " " + email + " " + pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam2?useSSL=false&characterEncoding=utf8",
                "root", "coderslab");
             Statement stat = conn.createStatement()) {
            ResultSet rs = stat.executeQuery(query2);
            while (rs.next()) {
                int id = rs.getInt(1);
                String description = rs.getString(2);
                String created = rs.getString(3);
                int user_id = rs.getInt(4);
                System.out.println(id + " " + description + " " + created + " " + user_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
