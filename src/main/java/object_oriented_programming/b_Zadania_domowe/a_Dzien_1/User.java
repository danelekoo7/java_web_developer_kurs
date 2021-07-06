package object_oriented_programming.b_Zadania_domowe.a_Dzien_1;


import java.util.Arrays;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    protected User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBook(Book book) {
        Book[] newTab = Arrays.copyOf(this.books, this.books.length + 1);
        newTab[newTab.length - 1] = book;
        this.books = newTab;
    }

}
