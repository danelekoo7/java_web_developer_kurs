package bazy_danych.exam;

public class Main2 {
    // zakomentowana logika która wykonywałem w konsoli
//	INSERT INTO items (name, description, price)
//	VALUES ('cos', 'fajne', 52),
//       ('cos2', 'fajne2', 48),
//			   ('cos3', 'fajne3', 50);
    private static final String QUERY1 = "SELECT *\n" +
            "FROM items\n" +
            "WHERE price > 50\n" +
            "ORDER BY price ASC;";
    private static final String QUERY2 = "INSERT INTO items (name, description)\n" +
            "VALUES ('product 1', 'desc 1');";
    //	INSERT INTO users ()
//	VALUES (),
//       (),
//			   (),
//			   (),
//			   (),
//			   (),
//			   ();
    private static final String QUERY3 = "DELETE\n" +
            "FROM users\n" +
            "WHERE id = 7;";
    //	INSERT INTO messages (user_id, message)
//	VALUES (1,'cos1'),
//       (2,'cos2'),
//			   (3,'cos3'),
//			   (2,'cos4'),
//			   (1,'cos5');
//
    private static final String QUERY4 = "SELECT DISTINCT users.id, users.name\n" +
            "FROM users\n" +
            "         JOIN messages m on users.id = m.user_id\n" +
            "WHERE m.message IS NOT NULL\n" +
            "ORDER BY id;";
    private static final String QUERY5 = "SELECT *\n" +
			"FROM orders\n" +
			"         JOIN items_orders i on orders.id = i.order_id\n" +
			"         JOIN items i2 on i.item_id = i2.id\n" +
			"ORDER BY price DESC\n" +
			"LIMIT 1;";
    //	INSERT INTO orders (created)
//	VALUES ('2017-11-12'),
//       ('2017-11-11'),
//			   ('2017-11-1'),
//			   ('2017-11-15'),
//			   ('2017-11-12');
    private static final String QUERY6 = "SELECT *\n" +
            "FROM orders\n" +
            "WHERE created = '2017-11-12';";
    private static final String QUERY7 = "INSERT INTO items_orders(item_id, order_id)\n" +
            "VALUES (2, 6);";
}
