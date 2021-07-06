package bazy_danych.a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.*;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        DBUtil.showAllCinemas();
        System.out.println("---");
        int lineNumber = -1;
        boolean loop = true;
        while (loop) {
            System.out.println("podaj e - jeśli chcesz edytować, " +
                    "u - jeśli chcesz usunąć," +
                    "x - jeśli chcesz wyjść z programu");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("e")) {
                loop = false;
                boolean edition = false;
                while (!edition) {
                    System.out.println("podaj id wiersza do edycji");
                    String id = scanner.nextLine();
                    try {
                        lineNumber = Integer.parseInt(id);
                        edition = true;
                    } catch (Exception e) {
                        System.out.println("podano niepoprawny indeks");
                    }
                }
                System.out.println("Proszę podać nową nazwę");
                String name = scanner.nextLine();
                System.out.println("Proszę podać nowy adres");
                String address = scanner.nextLine();
                DBUtil.cienamasEdition(lineNumber, name, address);
                DBUtil.showAllCinemas();
            } else if (command.equals("u")) {
                loop = false;
                boolean delete = true;
                int deleteRow = -1;
                while (delete) {
                    System.out.println("podaj id wiersza do usunięcia");
                    String remove = scanner.nextLine();
                    try {
                        deleteRow = Integer.parseInt(remove);
                        delete = false;
                    } catch (Exception e) {
                        System.out.println("proszę podać prawidłowy indeks");
                    }
                }
                boolean confirm = true;
                while (confirm) {
                    System.out.println("Czy na pewno chcesz usunąć wiersz o id =" +
                            deleteRow + "? \nJeśli tak wpisz T. Jeśli nie wpisz N");
                    String answer = scanner.nextLine();
                    if (answer.equals("T")) {
                        DBUtil.cienamasDelete(deleteRow);
                        DBUtil.showAllCinemas();
                        confirm = false;
                    } else if (answer.equals("N")) {
                        confirm = false;
                    }
                }
            } else if (command.equals("x")) {
                loop = false;
            } else {
                System.out.println("podałeś niepoprawną komendę");
            }
        }
    }
}