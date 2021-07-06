package bazy_danych.a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main5 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT *\n" +
            "FROM cinemas_movies\n" +
            "        RIGHT JOIN cinemas c on cinemas_movies.cinema_id = c.id\n" +
            "WHERE movie_id = 1;";
    public String query2 = "SELECT *\n" +
            "FROM cinemas_movies\n" +
            "         RIGHT JOIN movies m on cinemas_movies.movie_id = m.id\n" +
            "WHERE cinema_id = 1;";
}
