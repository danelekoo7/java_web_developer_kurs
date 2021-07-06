package bazy_danych.exam;

import java.sql.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        double price = -1;

        System.out.println("podaj nazwe");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("podaj opis");
        Scanner scanner2 = new Scanner(System.in);
        String description = scanner.nextLine();

        boolean loop = true;
        while (loop) {
            System.out.println("podaj cene");
            Scanner scanner3 = new Scanner(System.in);
            String priceString = scanner.nextLine();
            try {
                price = Double.parseDouble(priceString);
                loop = false;
            } catch (Exception e) {
                System.out.println("podaj odpowiednią liczbę");
            }
        }

        String query = "INSERT INTO items (name, description, price)\n" +
                "VALUES ('" + name + "', '" + description + "', " + price + ");";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam2?useSSL=false&characterEncoding=utf8",
                "root", "coderslab");
             Statement stat = conn.createStatement()) {
            stat.executeUpdate(query);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }


}
