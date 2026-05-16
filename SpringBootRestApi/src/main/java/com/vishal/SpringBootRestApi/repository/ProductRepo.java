package com.vishal.SpringBootRestApi.repository;

import com.vishal.SpringBootRestApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
