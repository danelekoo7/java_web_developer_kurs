package bazy_danych.a_Zadania.a_Dzien_1.d_Relacje_1_wiele;


public class Main1 {
    //zapisz poniżej zapytanie dodające tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "CREATE TABLE opinions\n" +
            "(\n" +
            "    id          int          NOT NULL AUTO_INCREMENT,\n" +
            "    id_product  INT          NOT NULL,\n" +
            "    description VARCHAR(255) NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (id_product) REFERENCES products (id)\n" +
            ");";

    //poniżej zapisz zapytania dodające rekordy do tabeli
    public String queryProduct1Opinion1 = "insert into opinions(description, product_id)\n" +
            "values ('super product', 1);";
    public String queryProduct1Opinion2 = "insert into opinions(description, product_id)\n" +
            "values ('average product', 1);";
    public String queryProduct1Opinion3 = "insert into opinions(description, product_id)\n" +
            "values ('extra product', 1);";
    public String queryProduct1Opinion4 = "INSERT INTO opinions(description, product_id)\n" +
            "VALUES ('bad', 1);";
    public String queryProduct1Opinion5 = "INSERT INTO opinions (description, product_id)\n" +
            "VALUES ('good', 1);";

    public String queryProduct2Opinion1 = "insert into opinions(description, product_id)\n" +
            "values ('super product', 3);";
    public String queryProduct2Opinion2 = "insert into opinions(description, product_id)\n" +
            "values ('average product', 3);";
    public String queryProduct2Opinion3 = "insert into opinions(description, product_id)\n" +
            "values ('extra product', 3);";
    public String queryProduct2Opinion4 = "INSERT INTO opinions(description, product_id)\n" +
            "VALUES ('bad', 3);";
    public String queryProduct2Opinion5 = "INSERT INTO opinions (description, product_id)\n" +
            "VALUES ('good', 3);";

    public String queryProduct3Opinion1 = "insert into opinions(description, product_id)\n" +
            "values ('super product', 2);";
    public String queryProduct3Opinion2 = "insert into opinions(description, product_id)\n" +
            "values ('average product', 2);";
    public String queryProduct3Opinion3 = "insert into opinions(description, product_id)\n" +
            "values ('extra product', 2);";
    public String queryProduct3Opinion4 = "INSERT INTO opinions(description, product_id)\n" +
            "VALUES ('bad', 2);";
    public String queryProduct3Opinion5 = "INSERT INTO opinions (description, product_id)\n" +
            "VALUES ('good', 2);";
}
