package bazy_danych.a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main1 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT *\n" +
            "FROM tickets\n" +
            "         JOIN payments ON payments.ticket_id = ticket_id\n" +
            "WHERE payments.type = 'cash';";
    public String query2 = "SELECT *\n" +
            "FROM tickets\n" +
            "         JOIN payments ON payments.ticket_id = ticket_id\n" +
            "WHERE tickets.status = 0;";

}
