package bazy_danych.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    // zakomentowana logika która wykonywałem w konsoli
//	CREATE DATABASE exam2
//	CHARACTER SET utf8mb4
//	COLLATE utf8mb4_unicode_ci;

    private static final String QUERY1 = "CREATE TABLE users\n" +
            "(\n" +
            "    id       INT AUTO_INCREMENT,\n" +
            "    name     VARCHAR(60),\n" +
            "    email    VARCHAR(60) UNIQUE,\n" +
            "    password VARCHAR(60),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";
    private static final String QUERY2 = "CREATE TABLE messages\n" +
            "(\n" +
            "    id      INT AUTO_INCREMENT,\n" +
            "    user_id INT,\n" +
            "    message TEXT,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (user_id) REFERENCES users (id)\n" +
            ");";
    private static final String QUERY3 = "CREATE TABLE items\n" +
            "(\n" +
            "    id          INT AUTO_INCREMENT,\n" +
            "    name        VARCHAR(60),\n" +
            "    description TEXT,\n" +
            "    price       DECIMAL(7, 2),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";
    private static final String QUERY4 = "CREATE TABLE orders\n" +
            "(\n" +
            "    id          INT AUTO_INCREMENT,\n" +
            "    description TEXT,\n" +
            "    created     DATETIME,\n" +
            "    user_id     INT,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (user_id) REFERENCES users (id)\n" +
            ");";
    private static final String QUERY5 = "CREATE TABLE items_orders\n" +
            "(\n" +
            "    id       INT AUTO_INCREMENT,\n" +
            "    item_id  INT NOT NULL,\n" +
            "    order_id INT NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (order_id) REFERENCES orders (id),\n" +
            "    FOREIGN KEY (item_id) REFERENCES items (id)\n" +
            ");";


    public static void main(String[] args) throws SQLException {
        // wywołaj przygotowane zapytania
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam2?useSSL=false&characterEncoding=utf8",
                "root", "coderslab");
             Statement stat = conn.createStatement()) {
            stat.executeUpdate(QUERY1);
            stat.executeUpdate(QUERY2);
            stat.executeUpdate(QUERY3);
            stat.executeUpdate(QUERY4);
            stat.executeUpdate(QUERY5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
