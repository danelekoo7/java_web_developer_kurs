package object_oriented_programming.a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class CartItem {

    public Product product = new Product();
    public int quantity;


    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


}
