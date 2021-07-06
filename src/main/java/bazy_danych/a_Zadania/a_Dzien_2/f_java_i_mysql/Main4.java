package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main4 {
    public static void main(String[] args) {
        try (Connection conn = DBUtil.getCinemasConnection()) {
            DBUtil.printData(conn, "SELECT * FROM cinemas", "id");
            DBUtil.printData(conn, "SELECT * FROM cinemas", "name");
            DBUtil.printData(conn, "SELECT * FROM cinemas", "address");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


