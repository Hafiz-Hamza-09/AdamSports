package com.hafiz.SpringBootWebApp.controller;

import com.hafiz.SpringBootWebApp.data.Products;
import com.hafiz.SpringBootWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //Get All Products List
    @RequestMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    //Get the specific Product by ProductId
    @GetMapping("/products/{productId}")
    public Products getProductById(@PathVariable int productId){  //@PathVariable to map productId to "/products/{productId}"
        return  service.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products products){
         service.addProducts(products);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Products products){
        service.updateProducts(products);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
    }


}
