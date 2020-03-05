package bazy_danych.a_Zadania.a_Dzien_2.d_Relacje_wiele_wiele;


public class Main1 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
    public String query1 = "CREATE TABLE IF NOT EXISTS products_orders\n" +
            "(\n" +
            "    id          INT AUTO_INCREMENT,\n" +
            "    products_id INT NOT NULL,\n" +
            "    orders_id   INT NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (products_id) REFERENCES products (id),\n" +
            "    FOREIGN KEY (orders_id) REFERENCES orders (id)\n" +
            ");";

    //zapytania łączące produkty z zamówieniami
    public String query2 = "INSERT INTO products_orders(products_id, orders_id)\n" +
            "VALUES (1, 1),\n" +
            "       (1, 2),\n" +
            "       (1, 2),\n" +
            "       (2, 1),\n" +
            "       (2, 2);";
    public String query3 = "";
    public String query4 = "";
    public String query5 = "";

}
