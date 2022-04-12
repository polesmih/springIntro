package homeworks.service;

import homeworks.base.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product findById(int id);
}
