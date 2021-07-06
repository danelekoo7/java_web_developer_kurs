package object_oriented_programming.b_Zadania_domowe.b_Dzien_2;

import java.util.Arrays;

public class User extends Person {
    private Book[] books = new Book[0];

    protected User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void addBook(Book book) {
        Book[] newTab = Arrays.copyOf(this.books, this.books.length + 1);
        newTab[newTab.length - 1] = book;
        this.books = newTab;
    }

    public void returnBook(Book book) {
        book.returnBook();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAvailable()) {
                Book[] tab = new Book[books.length - 1];
                if (books.length>1) {
                    for (int j = 0; j < books.length - 1; j++) {
                        if (j < i) {
                            tab[j] = books[j];
                        } else {
                            tab[j] = books[j + 1];
                        }
                    }
                }
                this.books = tab;
                break;
            }
        }

    }


    public void returnAllBooks(){
        for (int i = 0; i <books.length ; i++) {
            books[i].returnBook();
        }
        Book[] tab = new Book[0];
        this.books=tab;
    }


    public void print() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}