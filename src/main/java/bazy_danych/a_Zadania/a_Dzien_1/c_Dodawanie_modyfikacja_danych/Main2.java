package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main2 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT * FROM products WHERE price>=50 LIMIT 10;";
    public static String query2 = "SELECT * FROM clients WHERE surname LIKE 'J%';";
    public static String query3 = "SELECT *\n" +
            "FROM orders\n" +
            "WHERE description IS NOT NULL ;\n";
    public static String query4 = "SELECT *\n" +
            "FROM products\n" +
            "WHERE price = 10;\n";
}
