package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("podaj id filmu do usunięcia");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        try (Connection conn = DBUtil.getCinemasConnection()) {
            DBUtil.remove(conn, "movies", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}