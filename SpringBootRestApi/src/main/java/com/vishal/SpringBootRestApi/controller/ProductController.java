package com.vishal.SpringBootRestApi.controller;

import com.vishal.SpringBootRestApi.model.Product;
import com.vishal.SpringBootRestApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod){
        return service.addProduct(prod);
    }
    @PutMapping("/products")
    public String  updateProduct(@RequestBody Product prod){
        return service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public String  deleteProduct(@PathVariable int prodId){
        return service.deleteProduct(prodId);
    }
}
