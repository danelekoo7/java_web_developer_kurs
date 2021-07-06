package spring.MVC.src.main.java.pl.coderslab.cookie;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduktDao {

    public List<Product> getList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "kartofel", 22));
        products.add(new Product(2L, "papier toaletowy", 555));
        return products;
    }

}