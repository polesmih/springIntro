package homeworks.repository.impl;

import homeworks.base.Product;
import homeworks.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final List<Product> products = new ArrayList<>();

    @PostConstruct
    private void init() {
//        for (int i = 0; i < 5; i++) {
//            products.add(new Product(i + 1, "Product" + (i + 1), (i + 1)*10));
//    }
        products.add(new Product(1, "Camera", 25.5));
        products.add(new Product(2, "Calculator", 11.3));
        products.add(new Product(3, "Phone", 27.0));
        products.add(new Product(4, "Computer", 550.5));
        products.add(new Product(5, "Tablet", 40.5));

    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
