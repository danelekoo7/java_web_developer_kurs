package bazy_danych.b_Zadania_domowe.a_Dzien_2;


public class Main1 {

    public String query1 = "UPDATE offers\n" +
            "SET price=price+1000\n" +
            "WHERE owner >= 20\n" +
            "  AND owner <= 25;";

    public String query2 = "DELETE\n" +
            "FROM offers\n" +
            "WHERE expire <= (DATE_ADD(NOW(), INTERVAL '-3 0:0:0' DAY_SECOND));";

    public String query3 = "DELETE\n" +
            "FROM offers\n" +
            "WHERE phone LIKE '+48%'\n" +
            "  AND promoted = 1\n" +
            "  AND expire > NOW()\n" +
            "  AND status = 1;";

    public String query4 = "UPDATE offers\n" +
            "SET promoted = '1', promoted_to = DATE_ADD(NOW(), INTERVAL '23 0:0:0' DAY_SECOND)\n" +
            "WHERE SUBSTRING(phone, 3, 2) = 48\n" +
            "  AND promoted = 0;";

    public String query5 = "UPDATE\n" +
            "    offers\n" +
            "SET description = REPLACE(description, 'executed', 'found')\n" +
            "WHERE phone LIKE '%(%'\n" +
            "   OR phone LIKE '%)%'\n" +
            "    AND price > 400000;";
}
