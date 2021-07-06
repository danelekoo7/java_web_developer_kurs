package bazy_danych.b_Zadania_domowe.a_Dzien_1;


public class Main3 {
    public String queryAddImages1 = "INSERT INTO images (offer_id, src, dimension)\n" +
            "VALUES (1,'https://image.com/photos/1', '200x200');";
    public String queryAddImages2 = "INSERT INTO images (offer_id, src, dimension)\n" +
            "VALUES (2,'https://image.com/photos/2', '400x400');";
    public String queryAddImages3 = "INSERT INTO images (offer_id, src, dimension)\n" +
            "VALUES (3,'https://image.com/photos/3', '800x800');";
    public String queryAddImages4 = "INSERT INTO images (offer_id, src, dimension)\n" +
            "VALUES (4,'https://image.com/photos/4', '1920x720');";
    public String queryAddImages5 = "INSERT INTO images (offer_id, src, dimension)\n" +
            "VALUES (5,'https://image.com/photos/5', '1000x500');";

    public String queryAddCompany1 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (1, 'Anna', 123, 'street1', 1, '123456', '10-100', 10000.01, 1.1111, NOW());";
    public String queryAddCompany2 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (2, 'Bernadeta', 456, 'street2', 2, '626582', '10-200', 11000.01, 1.2111, '2019-11-13 09:14:00');";
    public String queryAddCompany3 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (3, 'Celina', 789, 'street3', 3, '225422', '10-300', 10100.01, 1.3111, '2019-10-13 09:14:00');";
    public String queryAddCompany4 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (4, 'Danuta', 101, 'street4', 4, '55582', '10-400', 10010.01, 1.4111, '2019-12-10 09:14:00');";
    public String queryAddCompany5 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (5, 'Emilia', 234, 'street5', 5, '258264', '10-500', 10001.01, 1.5111, '2019-12-08 09:14:00');";

}
