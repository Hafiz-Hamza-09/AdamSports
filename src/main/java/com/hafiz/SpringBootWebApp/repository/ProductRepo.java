package com.hafiz.SpringBootWebApp.repository;

import com.hafiz.SpringBootWebApp.data.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {
}
