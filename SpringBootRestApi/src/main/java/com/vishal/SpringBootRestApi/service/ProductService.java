package com.vishal.SpringBootRestApi.service;

import com.vishal.SpringBootRestApi.model.Product;
import com.vishal.SpringBootRestApi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public String addProduct(Product prod) {
        repo.save(prod);
        return "Added Successfully";
    }

    public String updateProduct(Product prod) {
       repo.save(prod);
       return "Updated Successfully";
    }

    public String deleteProduct(int prodId) {
        repo.deleteById(prodId);
        return "Deleted Successfully";
    }
}
