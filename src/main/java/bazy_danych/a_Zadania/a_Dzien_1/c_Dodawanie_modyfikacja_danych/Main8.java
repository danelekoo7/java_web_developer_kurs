package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main8 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "UPDATE cinemas\n" +
            "SET address = 'Stadion Narodowy'\n" +
            "WHERE name LIKE '%z';";
    public static String query2 = "DELETE\n" +
            "FROM payments\n" +
            "WHERE payment_date > DATE_SUB(NOW(), INTERVAL '2 0:0:0' DAY_SECOND);";
    public static String query3 = "UPDATE movies\n" +
            "SET rating = '5.4'\n" +
            "WHERE CHAR_LENGTH(description)>40;";
    public static String query4 = "UPDATE tickets\n" +
            "SET price = 0.5 * price\n" +
            "WHERE quantity > 10;\n";
}