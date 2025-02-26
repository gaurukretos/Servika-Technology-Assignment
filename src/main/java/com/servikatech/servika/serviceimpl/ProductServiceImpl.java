package com.servikatech.servika.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servikatech.servika.exception.ResourceNotFoundException;
import com.servikatech.servika.model.Product;
import com.servikatech.servika.repository.ProductRepository;
import com.servikatech.servika.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(UUID productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + productId));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(UUID productId, Product updateProduct) {
        Product product = getProductById(productId);
        product.setName(updateProduct.getName());
        product.setDescription(updateProduct.getDescription());
        product.setPrice(updateProduct.getPrice());

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(UUID productId) {
        Product product = getProductById(productId);
        productRepository.delete(product);
    }

}
