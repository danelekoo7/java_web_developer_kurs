package bazy_danych.a_Zadania.a_Dzien_1.b_Modyfikacja_tabel;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "ALTER TABLE movies ADD watchCount INT;";
    public String query2 = "ALTER TABLE movies ADD isTop TINYINT(1) DEFAULT 0;";
    public String query3 = "ALTER TABLE cinemas ADD COLUMN openTime TIME;";
    public String query4 = "ALTER TABLE cinemas ADD COLUMN closeTime TIME;";
    
}
