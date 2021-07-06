package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main7 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "DELETE FROM movies WHERE id=4;";
    public static String query2 = "DELETE FROM cinemas WHERE name='helios'";
    public static String query3 = "UPDATE tickets SET quantity=10;";
    public static String query4 = "DELETE  FROM payments WHERE payment_date < '2019-01-01';";
}