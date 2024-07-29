package com.spring.service;

import com.spring.dto.ProductDTO;
import com.spring.model.Product;


import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(Integer id);
    Product saveUser(Product product);
    void deleteUser(Integer id);
}
