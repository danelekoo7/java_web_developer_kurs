package object_oriented_programming.b_Zadania_domowe.b_Dzien_2;

public class Main3 {
    public static void main(String[] args) {

        Book book = new Book(6, "nad niemnem");
        Book book1 = new Book(7, "puszcza");

        User user = new User(2, "Daniel", "Jed");


        System.out.println(book.toString());

        System.out.println(book1.equals(book));

        book.setCurrentUser(user);
        book1.setCurrentUser(user);

        System.out.println(book.toString());
        System.out.println(book1.toString());

      /*  book.returnBook();
        System.out.println(book.toString());
*/
        System.out.println("1");
        user.print();
        System.out.println("2");

        /*user.returnBook(book);
        user.returnBook(book1);
        */

        user.returnAllBooks();


        System.out.println("3");
        user.print();
        System.out.println("4");
    }
}
