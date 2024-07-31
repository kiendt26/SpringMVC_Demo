package com.spring.service;

import com.spring.entities.Product;


import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(Integer id);
    Product saveUser(Product product);
    void deleteUser(Integer id);
}
