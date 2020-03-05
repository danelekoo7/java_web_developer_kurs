package bazy_danych.b_Zadania_domowe.a_Dzien_1;


public class Main2 {
    public String createTableImagesQuery = "CREATE TABLE images\n" +
            "(\n" +
            "    id        int unsigned auto_increment primary key,\n" +
            "    offer_id  int unsigned,\n" +
            "    src       varchar(100),\n" +
            "    dimension varchar(10),\n" +
            "    foreign key (offer_id) REFERENCES offers (id)\n" +
            ");";

    public String createTableUsersCompaniesQuery = "CREATE TABLE users_companies\n" +
            "(\n" +
            "    id         int unsigned auto_increment primary key,\n" +
            "    user_id    int unsigned unique,\n" +
            "    name       varchar(30),\n" +
            "    nip        int,\n" +
            "    street     varchar(50),\n" +
            "    street_nr  mediumint,\n" +
            "    phone      char(9),\n" +
            "    post_code  char(6),\n" +
            "    capital    decimal(7, 2),\n" +
            "    rate       decimal(5, 4),\n" +
            "    created_at datetime,\n" +
            "    FOREIGN KEY (user_id) REFERENCES users (id)\n" +
            ");";
}
