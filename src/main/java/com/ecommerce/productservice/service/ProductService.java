package com.ecommerce.productservice.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.productservice.entity.Product;

public interface ProductService {
    public List<Product> getAllProduct();
    public List<Product> getAllProductByCategory(String category);
    public Optional<Product> findById(Long id);
    public List<Product> getAllProductsByName(String name);
    public Product addProduct(Product product);
    public void deleteProduct(Long productId);
    public Product updateProduct(Product product);
    
}
