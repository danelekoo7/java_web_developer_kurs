package object_oriented_programming.b_Zadania_domowe.b_Dzien_2;

public class Book {


    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors;

    private static int popularity;

    private User currentUser;

    protected Book() {

    }

    protected Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    protected Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    protected Book(int id, String title, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    public Author[] getAdditionalAuthors() {
        return this.additionalAuthors;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        this.available = false;
        popularity++;
        currentUser.addBook(this);
    }

    public User getCurrentUser() {
        return this.currentUser;
    }

    public boolean equals(Book book) {
        boolean result = false;
        if (book.id == this.id) {
            result = true;
        }
        return result;
    }

    public void returnBook() {
        setAvailable(true);
        currentUser=null;
    }

    public String toString() {
        return this.id + " " + this.title + " "
                + this.author + " " + this.additionalAuthors +
                " " + this.available + " " + this.currentUser;
    }

}
