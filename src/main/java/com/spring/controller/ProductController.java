package com.spring.controller;

import com.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/home")
    public String home(Model model) {

        String message = "Hello Kiendz1102";

        model.addAttribute("message", message);

        return "index";
    }

    @GetMapping("/product")
    public ModelAndView product() {
        ModelAndView m = new ModelAndView("product");
        m.addObject("productList",productService.getAll());
        return m;
    }

    @GetMapping("/product/{id}")
    public ModelAndView productDetails(@PathVariable Integer id) {
        ModelAndView m = new ModelAndView("product-details");
        m.addObject("product", productService.getById(id));
        return m;
    }

    



}
