package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("podaj nazwę kina");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("podaj adres kina");
        Scanner scan = new Scanner(System.in);
        String address = scan.nextLine();
        addCinema(name, address);
    }

    static void addCinema(String name, String address) {
        try (Connection conn = DBUtil.getCinemasConnection()) {
            DBUtil.insert(conn, "INSERT INTO cinemas(name, address) VALUES (?, ?)", name, address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
