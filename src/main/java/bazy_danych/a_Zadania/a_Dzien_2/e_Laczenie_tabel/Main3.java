package bazy_danych.a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main3 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT *\n" +
            "FROM products\n" +
            "         JOIN opinions o on products.id = o.product_id;";
    public String query2 = "SELECT *\n" +
            "FROM products\n" +
            "         LEFT JOIN opinions o on products.id = o.product_id;";
    public String query3 = "SELECT *\n" +
            "FROM opinions\n" +
            "         JOIN products p on opinions.product_id = p.id\n" +
            "WHERE product_id = 1;";

}
