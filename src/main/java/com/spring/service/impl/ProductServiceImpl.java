package com.spring.service.impl;

import com.spring.dao.ProductDAO;
import com.spring.dto.ProductDTO;
import com.spring.model.Product;
import com.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getAll() {
        return productDAO.findAll();
    }

    @Override
    public Product getById(Integer id) {
        return productDAO.findById(id).orElse(null);
    }

    @Override
    public Product saveUser(Product product) {
        return productDAO.save(product);
    }

    @Override
    public void deleteUser(Integer id) {
        productDAO.deleteById(id);
    }


}
