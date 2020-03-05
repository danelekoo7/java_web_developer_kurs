package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main1 {

	//zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:

    public String table1row1 = "INSERT INTO clients(name, surname)\n" +
            "VALUES ('Adam', 'Adamski');";
    public String table1row2 = "INSERT INTO clients(name, surname)\n" +
            "VALUES ('Bronek', 'Bronkowski');";


	//zapisz poniżej zapytania dodające rekordy do drugiej tabeli:

    public String table2row1 = "INSERT INTO orders (description)\n" +
            "VALUES ('aaaaa'),\n" +
            "       ('bbbbbbbb');";
    public String table2row2 = "";


	//zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:
	
    public String table3row1 = "INSERT INTO products (name, description, price)\n" +
            "VALUES ('cos1', 'fajne1', 11),\n" +
            "       ('cos2', 'fajne2', 12);";
    public String table3row2 = "";
}
