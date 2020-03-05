package bazy_danych.a_Zadania.a_Dzien_1.d_Relacje_1_1;


public class Main3 {
    //zapisz poniżej zapytanie tworzące tabelę - pamiętaj o relacji i dodaniu odpowiedniej kolumny
    public String queryCreateTable = "ALTER TABLE payments\n" +
            "    ADD FOREIGN KEY (id) REFERENCES tickets (id);";

    //zapisz zapytania dodające wpisy do tabeli `payments`
    public String query1 = "INSERT INTO payments(type, payment_date)\n" +
            "VALUES ('cash',NOW());";
    public String query2 = "INSERT INTO payments(type, payment_date)\n" +
            "VALUES ('cash',NOW());";
    public String query3 = "INSERT INTO payments(type, payment_date)\n" +
            "VALUES ('card',NOW());";
    public String query4 = "INSERT INTO payments(type, payment_date)\n" +
            "VALUES ('card',NOW());";
    public String query5 = "INSERT INTO payments(type, payment_date)\n" +
            "VALUES ('transfer',NOW());";
}
