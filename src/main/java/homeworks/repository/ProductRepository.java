package homeworks.repository;

import homeworks.base.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product findById(int id);
}
