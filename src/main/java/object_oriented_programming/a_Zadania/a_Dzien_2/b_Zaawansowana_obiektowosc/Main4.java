package object_oriented_programming.a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Main4 {
    public static void main(String[] args) {
        Product kolo = new Product("koło", 250);
        Product lozysko = new Product("łozysko", 20);
        Product kierownica = new Product("kierowica",100);
        Product lewarek = new Product( "lewarek", 55);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(kolo, 2);
        shoppingCart.addProduct(lozysko,4);
        shoppingCart.addProduct(kierownica,1);
        shoppingCart.addProduct(lozysko, 10);
        shoppingCart.addProduct(kierownica,5);
        shoppingCart.addProduct(lewarek,2);

        shoppingCart.updateProduct(kolo,20);

        System.out.println(shoppingCart.getTotalQuantity());

        System.out.println(shoppingCart.getTotalSum());




        //shoppingCart.removeProduct(lozysko);


        shoppingCart.printReceipt();

        //shoppingCart.toString();


    }
}
