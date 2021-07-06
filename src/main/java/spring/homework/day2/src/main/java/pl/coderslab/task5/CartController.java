package spring.homework.day2.src.main.java.pl.coderslab.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;

@Controller
public class CartController {

    private final Logger logger = LoggerFactory.getLogger(CartController.class);
    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/increase/{id}")
    public String plus(@PathVariable int id) {
        cart.getCartItems().forEach(cartItem -> {
            System.out.println("cartitem string");
            if (cartItem.getProduct().getId() == id) {
                cartItem.setQuantity(cartItem.getQuantity() + 1);
            }
        });
        return "redirect:http://localhost:8080/cart";
    }

    @RequestMapping("/decrease/{id}")
    public String minus(@PathVariable int id) {
        cart.getCartItems().forEach(cartItem -> {
            System.out.println("cartitem string");
            if (cartItem.getProduct().getId() == id) {
                cartItem.setQuantity(cartItem.getQuantity() - 1);
            }
        });
        return "redirect:http://localhost:8080/cart";
    }

    @RequestMapping("/remove/{id}")
    public String delete(@PathVariable int id) {
        int listId = -1;
        for (int i = 0; i < cart.getCartItems().size(); i++) {

            if (cart.getCartItems().get(i).getProduct().getId() == id) {
                listId = i;
            }
        }
        if (listId != -1) {
            cart.getCartItems().remove(listId);
        }
        return "redirect:http://localhost:8080/cart";
    }


    @RequestMapping("/cart")
    public String cart(Model model) {
        cart.getCartItems().forEach(ci -> logger.info("product : {} , quantity: {}", ci.getProduct().getName(), ci.getQuantity()));

        model.addAttribute("cart", cart.getCartItems());

        int amountOfProducts = cart.getCartItems().size();
        int amountOfQuantity = cart.getCartItems().stream()
                .mapToInt(value -> value.getQuantity()).sum();
        double totalPrice = cart.getCartItems().stream()
                .mapToDouble(value -> value.getProduct().getPrice() * value.getQuantity())
                .sum();

        String result = cart.toString() + "\n" +
                "W koszyku jest " + amountOfQuantity + " pozycji." +
                "\nW koszyku jest " + amountOfProducts + " produktów." +
                "\nWartość koszyka to: " + totalPrice;

        model.addAttribute("result", result);
        return "cart";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/form")
    public String form(long id, String name, double price, int quantity) {
        Product product = new Product(id, name, price);
        CartItem cartItem = new CartItem(quantity, product);
        cart.addToCart(cartItem);
        return "form";
    }
}