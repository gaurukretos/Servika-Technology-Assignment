package com.servikatech.servika.service;

import java.util.List;
import java.util.UUID;

import com.servikatech.servika.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(UUID productId);

    Product createProduct(Product product);

    Product updateProduct(UUID productId, Product updateProduct);

    void deleteProduct(UUID productId);

}
