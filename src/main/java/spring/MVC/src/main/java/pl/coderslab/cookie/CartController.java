package spring.MVC.src.main.java.pl.coderslab.cookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
public class CartController {

    private final Logger logger = LoggerFactory.getLogger(CartController.class);
    private final Cart cart;

    @Autowired
    private ProduktDao produktDao;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    //http://localhost:8080/addtocart
    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(rand.nextInt(10),
                new Product(rand.nextLong(), "prod" +
                        rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    //http://localhost:8080/cart
    @RequestMapping("/cart")
    @ResponseBody
    public String cart() {
        cart.getCartItems().forEach(ci -> logger.info("product : {} , quantity: {}", ci.getProduct().getName(), ci.getQuantity()));

        int amountOfProducts = cart.getCartItems().size();
        int amountOfQuantity = cart.getCartItems().stream()
                .mapToInt(value -> value.getQuantity()).sum();
        double totalPrice = cart.getCartItems().stream()
                .mapToDouble(value -> value.getProduct().getPrice() * value.getQuantity())
                .sum();

        return cart.toString() + "\n" +
                "W koszyku jest " + amountOfQuantity + " pozycji." +
                "\nW koszyku jest " + amountOfProducts + " produktów." +
                "\nWartość koszyka to: " + totalPrice;
    }
    //////////////////////////////////////////////////////

    //http://localhost:8080/products
    @RequestMapping("/products")
    @ResponseBody
    public String products() {
        return produktDao.getList().toString();
    }

    //http://localhost:8080/addtocartfromlist?id=1&quantity=5
    @GetMapping("/addtocartfromlist")
    @ResponseBody
    public void addtocartfromlist(@RequestParam String id, @RequestParam String quantity) {
        List<Product> productList = produktDao.getList();
        Product product = productList.stream()
                .filter(p -> p.getId().equals(Long.valueOf(id)))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        cart.getCartItems().stream()
                .filter(cartItem -> cartItem.getProduct().getId().equals(product.getId()))
                .findFirst()
                .ifPresentOrElse(cartItem -> cartItem.setQuantity(cartItem.getQuantity() + Integer.valueOf(quantity)), () -> {
                    cart.getCartItems().add(new CartItem(Integer.valueOf(quantity), product));
                });
    }

    //http://localhost:8080/cart2
    @RequestMapping("/cart2")
    @ResponseBody
    public String cart2() {
        return String.format("W koszyku jest %s pozycji." + "\n" +
                        "W koszyku jest  %s  produktów." + "\n" +
                        "Wartość koszyka to:  %s ", cart.getCartItems().size(), cart.getCartItems().stream().map(CartItem::getQuantity).count(),
                cart.getCartItems().stream().map(cartItem -> cartItem.getQuantity() * cartItem.getProduct().getPrice()).count());
    }
}