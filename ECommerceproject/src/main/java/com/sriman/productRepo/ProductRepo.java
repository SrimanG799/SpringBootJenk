package com.sriman.productRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sriman.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
