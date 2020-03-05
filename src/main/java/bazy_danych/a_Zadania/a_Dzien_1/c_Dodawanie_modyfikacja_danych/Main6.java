package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main6 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT SUM(quantity)\n" +
            "FROM tickets;";
    public static String query2 = "SELECT COUNT(type)\n" +
            "FROM payments;";
    public static String query3 = "SELECT AVG(price) FROM tickets;";
    public static String query4 = "SELECT * FROM payments LIMIT 5 OFFSET 1;";
    public static String query5 = "SELECT type, COUNT(*) AS size\n" +
            "FROM payments\n" +
            "GROUP BY type\n" +
            "HAVING size > 2;";
    public static String query6 = "SELECT SUM(quantity)\n" +
            "FROM tickets\n" +
            "WHERE price > 23.15;";
}