package bazy_danych.b_Zadania_domowe.a_Dzien_2;


public class Main2 {

    public String queryRelationImages = "ALTER TABLE images\n" +
            "    ADD FOREIGN KEY (offer_id) REFERENCES offers (id);";

    public String queryRelationUsersCompanies = "ALTER TABLE users_companies\n" +
            "    DROP id;\n" +
            "ALTER TABLE users_companies\n" +
            "    ADD PRIMARY KEY (user_id);\n" +
            "ALTER TABLE users_companies\n" +
            "    ADD FOREIGN KEY (user_id) REFERENCES users (id);\n";
}
