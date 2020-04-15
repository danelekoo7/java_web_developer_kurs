package spring.homework.day1.src.main.java.pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.sql.*;
import java.time.LocalDateTime;

import static pl.coderslab.bean.DbUtil.getConnection;

@Component
@Qualifier("dBCustomerLogger")
public class DBCustomerLogger implements CustomerLogger {

   private static final String CREATE_QUERY = "INSERT INTO Log (log) VALUE (?);";

    @Override
    public void log() {
        try {
            Connection connection = getConnection();
            PreparedStatement prepStm = connection.prepareStatement(CREATE_QUERY);
            prepStm.setString(1, "nowy log do bazy danych " + LocalDateTime.now());
            prepStm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
