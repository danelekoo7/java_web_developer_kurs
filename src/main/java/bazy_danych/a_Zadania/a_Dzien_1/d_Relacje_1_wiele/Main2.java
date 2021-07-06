package bazy_danych.a_Zadania.a_Dzien_1.d_Relacje_1_wiele;


public class Main2 {
    //zapisz poniżej zapytania tworzące odpowiednie tabele

    public String queryAddCategories = "CREATE TABLE categories\n" +
            "(\n" +
            "    id   int NOT NULL AUTO_INCREMENT,\n" +
            "    name varchar(255),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";

    public String queryAddCategoriesSub = "CREATE TABLE categories_sub\n" +
            "(\n" +
            "    id      int NOT NULL AUTO_INCREMENT,\n" +
            "    main_id int NOT NULL,\n" +
            "    name    varchar(255),\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (main_id)\n" +
            "        REFERENCES categories (id)\n" +
            ");";

}
