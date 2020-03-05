package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {

    public static void main(String[] args) {
        try (Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn, "INSERT INTO categories(name) VALUES (?)", "aa");
            DBUtil.insert(conn, "INSERT INTO categories_sub(name, main_id) VALUES (?, ?)", "SUB_NAME", "1");
            DBUtil.insert(conn, "INSERT INTO clients(name, surname) VALUES (?, ?)", "IMIE", "NAZWISKO");
            DBUtil.insert(conn, "INSERT INTO client_address(city, street, house_nr) VALUES (?, ?, ?)", "DOM", "SWIETLISTA", "5");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
