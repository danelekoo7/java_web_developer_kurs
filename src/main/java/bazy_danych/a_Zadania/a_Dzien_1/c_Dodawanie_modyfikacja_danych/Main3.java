package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main3 {
    
    public String query1 = "INSERT INTO products SET id=0, name=produkt1, description=name, price=904";
    public String query1fixed = "INSERT INTO products (name, description, price)\n" +
            "VALUES ('produkt1', 'name', 904);";

    public String query2 = "INSERT INTO clients VALUES(\"Jan\", \"Kowalski\", 4, \"Mr.\")";
    public String query2fixed = "INSERT INTO clients (id, name, surname) VALUES(4,'Jan', 'Kowalski');";

    public String query3 = "INSERT INTO movies(id, rating, title) VALUES(null, \"bardzo dobry\", \"Szybcy i wściekli\")";
    public String query3fixed = "INSERT INTO movies(id, rating, title) VALUES(null, 8, 'Szybcy i wściekli');";

    public String query4 = "INSERT INTO payments SET id=90 AND VALUES(\"cash\", NOW())";
    public String query4fixed = "INSERT INTO payments(id, type, payment_date) VALUES (90, 'cash', NOW())";
}
