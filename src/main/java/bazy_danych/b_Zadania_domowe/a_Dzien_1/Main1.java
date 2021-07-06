package bazy_danych.b_Zadania_domowe.a_Dzien_1;


public class Main1 {
    public String query1 = "SELECT * FROM users WHERE name LIKE 'Julia %';";

    public String query2 = "SELECT *\n" +
            "FROM users\n" +
            "ORDER BY email DESC\n" +
            "LIMIT 5;";

    public String query3 = "SELECT *\n" +
            "FROM users\n" +
            "WHERE email LIKE '%@yahoo.com'\n" +
            "  AND name LIKE 'L%';";

    public String query4 = "SELECT *\n" +
            "FROM users\n" +
            "WHERE password = SHA2(CONCAT(name, salt), 256);";

    public String query5 = "SELECT id, title\n" +
            "FROM offers\n" +
            "WHERE price > 500000;";

    public String query6 = "SELECT id, price\n" +
            "FROM offers\n" +
            "WHERE activation_token = ''\n" +
            "  AND price BETWEEN 2000 AND 400000;\n";

    public String query7 = "SELECT title, price, phone\n" +
            "FROM offers\n" +
            "WHERE expire > now()\n" +
            "  AND expire < DATE_ADD(NOW(), INTERVAL '10 0:0:0' DAY_SECOND);";

    public String query8 = "SELECT *\n" +
            "FROM offers\n" +
            "WHERE description LIKE '%violent%'\n" +
            "  AND phone LIKE '%2%'\n" +
            "  AND price > 50000;";

    public String query9 = "SELECT *\n" +
            "FROM offers\n" +
            "WHERE promoted_to > NOW()\n" +
            "  AND price < 300000\n" +
            "  AND title LIKE 'LLC%';\n";

    public String query10 = "SELECT *\n" +
            "FROM offers\n" +
            "WHERE price * 2 < 50000\n" +
            "  AND promoted_to > NOW();";

    public String query11 = "\n" +
            "SELECT COUNT(*) AS sum_active\n" +
            "FROM offers\n" +
            "WHERE expire > NOW()\n" +
            "  AND status = 1;";

    public String query12 = "SELECT owner, COUNT(*) AS sum_user\n" +
            "FROM offers\n" +
            "WHERE expire > NOW()\n" +
            "  AND status = 1\n" +
            "GROUP BY owner;";

    public String query13 = "SELECT status AS type, COUNT(*) AS counter\n" +
            "FROM offers\n" +
            "WHERE status = 1\n" +
            "   OR status = 2\n" +
            "GROUP BY status;";

    public String query14 = "SELECT SUM(price) AS sum_nonactive_nopromoted\n" +
            "FROM offers\n" +
            "WHERE expire < NOW()\n" +
            "  AND activation_token != ''\n" +
            "  AND status = 1\n" +
            "  AND promoted = 0;";

    public String query15 = "SELECT ROUND(AVG(price), 2) AS avg_price\n" +
            "FROM offers\n" +
            "WHERE expire > NOW()\n" +
            "  AND promoted_to > NOW()\n" +
            "  AND price > 44645.04;";

}
