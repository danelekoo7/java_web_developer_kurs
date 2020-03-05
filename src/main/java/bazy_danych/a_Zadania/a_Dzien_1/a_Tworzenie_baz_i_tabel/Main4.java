package bazy_danych.a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main4 {
//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
	public static String queryCreateTableCinemas = "CREATE TABLE cinemas\n" +
		"(\n" +
		"    id      INT AUTO_INCREMENT,\n" +
		"    name    VARCHAR(255),\n" +
		"    address VARCHAR(255),\n" +
		"    PRIMARY KEY (id)\n" +
		");";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
	public static String queryCreateTableMovies = "CREATE TABLE movies\n" +
		"(\n" +
		"    id          INT AUTO_INCREMENT,\n" +
		"    title       VARCHAR(255),\n" +
		"    description VARCHAR(255),\n" +
		"    rating      DECIMAL(4, 2),\n" +
		"    PRIMARY KEY (id)\n" +
		");";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
	public static String queryCreateTableTickets = "CREATE TABLE tickets\n" +
		"(\n" +
		"    id       INT AUTO_INCREMENT,\n" +
		"    quantity INT,\n" +
		"    price    DECIMAL(4, 2),\n" +
		"    status   TINYINT(1),\n" +
		"    PRIMARY KEY (id)\n" +
		");\n";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego czwartą tabelę
	public static String queryCreateTablePayments = "CREATE TABLE payments\n" +
		"(\n" +
		"    id           INT AUTO_INCREMENT,\n" +
		"    type         VARCHAR(60),\n" +
		"    payment_date DATETIME,\n" +
		"    PRIMARY KEY (id)\n" +
		");";
}
