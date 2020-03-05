package bazy_danych.b_Zadania_domowe.a_Dzien_2;

public class Extra {
    public String query1 = "SELECT *\n" +
            "    FROM Teams\n" +
            "    ORDER BY points DESC\n" +
            "    LIMIT 1;";

    public String query2 = "SELECT *\n" +
            "    FROM Teams\n" +
            "    ORDER BY points DESC;";

    public String query3 = "SELECT T.name, T2.name, team_home_goals, team_away_goals\n" +
            "      FROM Games\n" +
            "         JOIN Teams T on Games.team_home = T.id\n" +
            "         JOIN Teams T2 ON Games.team_away = T2.id\n" +
            "      WHERE T.name = 'Naprzód Brwinów'";

    public String query4 = "SELECT THome.name, TAway.name, team_home_goals, team_away_goals\n" +
            "FROM Games\n" +
            "         JOIN Teams THome ON Games.team_home = THome.id\n" +
            "         JOIN Teams TAway ON Games.team_away = TAway.id\n" +
            "WHERE THome.name = 'Naprzód Brwinów'";

    public String query5 = "SELECT THome.name, TAway.name, team_home_goals, team_away_goals\n" +
            "FROM Games\n" +
            "         JOIN Teams THome ON Games.team_home = THome.id\n" +
            "         JOIN Teams TAway ON Games.team_away = TAway.id\n" +
            "WHERE THome.name = 'Naprzód Brwinów'\n" +
            "   OR TAway.name = 'Naprzód Brwinów'";

    public String query6a = "SELECT SUM(team_home_goals)\n" +
            "    FROM Teams\n" +
            "    JOIN Games G on Teams.id = G.team_home\n" +
            "    WHERE name = 'Naprzód Brwinów';";

    public String query6b = "SELECT SUM(team_away_goals)\n" +
            "    FROM Teams\n" +
            "    JOIN Games G on Teams.id = G.team_away\n" +
            "    WHERE name = 'Naprzód Brwinów';";
}
