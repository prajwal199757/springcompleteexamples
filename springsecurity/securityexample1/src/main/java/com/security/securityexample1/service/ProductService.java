package com.security.securityexample1.service;

import com.security.securityexample1.entities.Product;

import java.util.List;
import java.util.Optional;



public interface ProductService {
    Product save(Product product);

    void deleteById(Long id);

    Optional<Product> findById(Long id);

    List<Product> findAll();
}
