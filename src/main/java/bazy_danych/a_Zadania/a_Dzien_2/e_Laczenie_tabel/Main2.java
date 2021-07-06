package bazy_danych.a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT *\n" +
            "FROM orders\n" +
            "         JOIN products_orders ON orders.id = products_orders.orders_id\n" +
            "WHERE products_orders.products_id = 1;";
    public String query2 = "SELECT *\n" +
            "FROM products\n" +
            "         JOIN products_orders ON products.id = products_orders.orders_id\n" +
            "WHERE products_orders.orders_id = 1;";

}
