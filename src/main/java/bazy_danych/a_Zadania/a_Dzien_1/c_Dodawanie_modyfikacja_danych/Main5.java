package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main5 {

    //zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT * FROM movies WHERE title LIKE 'W%';\n";
    public static String query2 = "SELECT *\n" +
            "FROM tickets\n" +
            "WHERE price > 15.30;";
    public static String query3 = "SELECT *\n" +
            "FROM tickets\n" +
            "WHERE quantity > 3;";
    public static String query4 = "SELECT *\n" +
            "FROM movies\n" +
            "WHERE rating > 6.5;";
    public static String query5 = "SELECT *\n" +
            "FROM movies\n" +
            "ORDER BY rating DESC\n" +
            "LIMIT 1;";
}