package bazy_danych.a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main4 {
    
    //zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:
    public String table1row1 = "INSERT INTO cinemas (id, name, address, openTime, closeTime)\n" +
            "VALUES (1,'helios', 'Warszawa', '10:00:00', '23:00:00'),\n" +
            "       (2,'imax', 'Kato', '10:00:00', '23:00:00'),\n" +
            "       (3,'multi', 'Lublin', '10:00:00', '23:00:00'),\n" +
            "       (4,'kin', 'Tychy', '10:00:00', '23:00:00'),\n" +
            "       (5,'filmowiec', 'Krosno', '10:00:00', '23:00:00');";
    public String table1row2 = "";
    public String table1row3 = "";
    public String table1row4 = "";
    public String table1row5 = "";


    //zapisz poniżej zapytania dodające rekordy do drugiej tabeli:
    public String table2row1 = "INSERT INTO movies(title, description, rating, director, watchCount, isTop)\n" +
            "VALUES ('komedia','romnatyczny','7','Jan',142,1),\n" +
            "       ('sensacja','zabójstwo',9,'Paweł',200,0),\n" +
            "       ('horro','duch',3,'Józek',5,0),\n" +
            "       ('anime','manga',6,'Janusz',6523,1),\n" +
            "       ('dramat','depresja',5,'Kasia',842,1);";
    public String table2row2 = "";
    public String table2row3 = "";
    public String table2row4 = "";
    public String table2row5 = "";


    //zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:
    public String table3row1 = "INSERT INTO payments (type, payment_date)\n" +
            "VALUES ('card','2019-08-02 11:24:36'),\n" +
            "       ('cash','2019-09-02 11:24:36'),\n" +
            "       ('transfer','2019-10-02 11:24:36'),\n" +
            "       ('card','2019-11-02 11:24:36'),\n" +
            "       ('cash','2019-11-22 11:24:36');";
    public String table3row2 = "";
    public String table3row3 = "";
    public String table3row4 = "";
    public String table3row5 = "";


    //zapisz poniżej zapytania dodające rekordy do czwartej tabeli:
    public String table4row1 = "\n" +
            "INSERT INTO tickets (quantity, price, status)\n" +
            "VALUES (5, 15, 1),\n" +
            "       (8, 18, 0),\n" +
            "       (9, 15, 0),\n" +
            "       (5, 22, 1),\n" +
            "       (5, 20, 1);";
    public String table4row2 = "";
    public String table4row3 = "";
    public String table4row4 = "";
    public String table4row5 = "";
}
