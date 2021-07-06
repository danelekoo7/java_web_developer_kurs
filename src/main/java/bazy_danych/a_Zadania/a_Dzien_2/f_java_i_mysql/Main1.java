package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main1 {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.connect()) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
