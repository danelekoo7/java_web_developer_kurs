package java8.b_Zadania_Domowe.a_Dzien_1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/modul5_dzien1?useSSL=false";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "coderslab";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}
}

