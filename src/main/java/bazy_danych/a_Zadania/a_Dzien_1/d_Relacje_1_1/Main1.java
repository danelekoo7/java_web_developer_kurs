package bazy_danych.a_Zadania.a_Dzien_1.d_Relacje_1_1;


public class Main1 {
    //zapisz poniżej zapytanie dodające tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "\n" +
            "CREATE TABLE client_address\n" +
            "(\n" +
            "    client_id INT AUTO_INCREMENT,\n" +
            "    city      VARCHAR(255),\n" +
            "    street    VARCHAR(255),\n" +
            "    house_nr  VARCHAR(255),\n" +
            "    PRIMARY KEY (client_id),\n" +
            "    FOREIGN KEY (client_id) REFERENCES clients (id)\n" +
            ");";

    //zapisz poniżej kod dodania do bazy rekordów
    public String tableAddRow1 = "insert into client_address(client_id, city, street, house_nr)\n" +
            "values (1, 'Bytom', 'Jaskółcza', '5');";
    public String tableAddRow2 = "insert into client_address(client_id, city, street, house_nr)\n" +
            "values (2, 'Sosnowiec', 'Dębowa', '15');";
    public String tableAddRow3 = "insert into client_address(client_id, city, street, house_nr)\n" +
            "values (3, 'Katowice', 'Morelowa', '12');";
    public String tableAddRow4 = "insert into client_address(client_id, city, street, house_nr)\n" +
            "values (4, 'Gliwice', 'Bazaltowa', '1');";
    public String tableAddRow5 = "insert into client_address(client_id, city, street, house_nr)\n" +
            "values (5, 'Ruda Śląska', 'Granitowa', '4');";
}
