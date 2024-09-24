package com.hafiz.SpringBootWebApp.controller;

import com.hafiz.SpringBootWebApp.data.Products;
import com.hafiz.SpringBootWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@CrossOrigin // @CrossOrigin - Front End connectivity
public class ProductController {

    @Autowired
    ProductService service;

    //Get All Products List
    @RequestMapping("/products")
    public ResponseEntity<List<Products>>  getProducts(){
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }

    //Get the specific Product by ProductId
    @GetMapping("/products/{productId}")
    public ResponseEntity<Products> getProductById(@PathVariable int productId){  //@PathVariable to map productId to "/products/{productId}"
        Products products = service.getProductById(productId);
        if(products != null)
            return  new ResponseEntity<>(products,HttpStatus.OK);
        else
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);

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
