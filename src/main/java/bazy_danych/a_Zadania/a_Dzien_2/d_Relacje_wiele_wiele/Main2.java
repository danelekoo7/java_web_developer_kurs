package bazy_danych.a_Zadania.a_Dzien_2.d_Relacje_wiele_wiele;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "CREATE TABLE IF NOT EXISTS cinemas_movies\n" +
            "(\n" +
            "    id         INT AUTO_INCREMENT,\n" +
            "    cinemas_id INT NOT NULL,\n" +
            "    movies_id  INT NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (cinemas_id) REFERENCES cinemas (id),\n" +
            "    FOREIGN KEY (movies_id) REFERENCES movies (id)\n" +
            ");\n" +
            "\n" +
            "INSERT INTO cinemas_movies (cinemas_id, movies_id)\n" +
            "VALUES (1, 2),\n" +
            "       (3, 5),\n" +
            "       (7, 1),\n" +
            "       (2, 5);";

}
