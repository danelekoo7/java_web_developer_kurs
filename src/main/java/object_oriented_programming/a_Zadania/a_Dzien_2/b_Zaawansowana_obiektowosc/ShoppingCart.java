package object_oriented_programming.a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


import java.util.Arrays;

public class ShoppingCart {
    private CartItem[] cartItems;

    public ShoppingCart() {
        this.cartItems = new CartItem[0];
    }


    public void addProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        boolean addNewItem = true;
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].product.equals(product)) {
                cartItems[i].quantity += quantity;
                addNewItem = false;
            }
        }
        if (addNewItem) {
            CartItem[] tab = Arrays.copyOf(this.cartItems, this.cartItems.length + 1);
            tab[this.cartItems.length] = cartItem;
            this.cartItems = tab;
        }
    }


    public void removeProduct(Product product) {
        CartItem[] tab = new CartItem[cartItems.length - 1];
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].product.equals(product)) {
                for (int j = 0; j < cartItems.length - 1; j++) {
                    if (j < i) {
                        tab[j] = cartItems[j];
                    } else {
                        tab[j] = cartItems[j + 1];
                    }
                }
                break;
            }
        }
        cartItems = tab;
    }


    public void updateProduct(Product product, int quantity) {
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].product.equals(product)) {
                cartItems[i].quantity = quantity;
            }
        }
    }

    public int getTotalQuantity() {
        int count = 0;
        for (int i = 0; i < cartItems.length; i++) {
            count += cartItems[i].quantity;
        }
        return count;
    }

    public double getTotalSum() {
        double sum = 0;
        for (int i = 0; i < cartItems.length; i++) {
            sum += (cartItems[i].product.price * cartItems[i].quantity);
        }
        return sum;
    }

    public void printReceipt() {
        for (int i = 0; i < cartItems.length; i++) {
            System.out.println(cartItems[i].product.id + " " +
                    cartItems[i].product.name + " " +
                    cartItems[i].quantity + "x" +
                    cartItems[i].product.price + " = " +
                    (cartItems[i].product.price * cartItems[i].quantity));
        }
        System.out.println("---");
        System.out.println("Razem: " + getTotalSum());
    }


    @Override
    public String toString() {

        for (int i = 0; i < cartItems.length; i++) {
            System.out.println(cartItems[i].quantity + cartItems[i].product.name);
        }
        return Arrays.toString(cartItems);
    }
}

