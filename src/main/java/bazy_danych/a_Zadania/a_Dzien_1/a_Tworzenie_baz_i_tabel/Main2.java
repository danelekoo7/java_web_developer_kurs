package bazy_danych.a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main2 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public static String queryCreateTableProducts = "CREATE TABLE products\n" +
            "(\n" +
            "    id          INT AUTO_INCREMENT,\n" +
            "    name        VARCHAR(255),\n" +
            "    description VARCHAR(255),\n" +
            "    price       DECIMAL(4, 2),\n" +
            "    PRIMARY KEY (id)\n" +
            ");\n";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public static String queryCreateTableOrders = "CREATE TABLE orders(\n" +
            "    id INT AUTO_INCREMENT,\n" +
            "    description VARCHAR(255),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public static String queryCreateTableClients ="CREATE TABLE clients(\n" +
            "    id INT AUTO_INCREMENT,\n" +
            "    name VARCHAR(255),\n" +
            "    surname VARCHAR(255),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";
}
