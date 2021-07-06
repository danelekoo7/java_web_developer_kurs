package bazy_danych.a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT *\n" +
            "FROM categories_sub\n" +
            "         RIGHT JOIN categories c on categories_sub.main_id = c.id\n" +
            "WHERE c.id = 1;";
    public String query2 = "SELECT DISTINCT categories.id, categories.name\n" +
            "FROM categories\n" +
            "         JOIN categories_sub cs on categories.id = cs.main_id;";

}
