package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad2;

public class ProductFactory {

    public static Product getProduct(String productType) {
        if (productType.equals("simple")) {
            return new SimpleProduct();
        }
        if (productType.equals("virtual")) {
            return new VirtualProduct();
        }
        if (productType.equals("advanced")) {
            return new AdvancedProduct();
        }
        throw new IllegalArgumentException("Bad product type " + productType);
    }

}
