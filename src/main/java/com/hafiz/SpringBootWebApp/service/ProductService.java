package com.hafiz.SpringBootWebApp.service;

import com.hafiz.SpringBootWebApp.data.Products;
import com.hafiz.SpringBootWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    public List<Products> products = new ArrayList<>(Arrays.asList
//            (new Products(101, "FC Barcelona Jersey - Nike", 1000.00),
//                    new Products(102, "Adidas Predator Boots", 4500.00),
//                    new Products(103, "Puma Running Shoes", 1500.00)));


    public List<Products> getProducts() {
        //return products;
        return repo.findAll();
    }

    public Products getProductById(int productId) {
        //Stream API used for filtering the List
        //return products.stream().filter(p -> p.getProductId() == productId).findFirst().get();

        return repo.findById(productId).orElse(new Products());
    }


    public void addProducts(Products prod) {
        //add() method of Java Collections
        //products.add(prod);

        repo.save(prod);

    }

    public void updateProducts(Products prod) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProductId() == prod.getProductId()) {
//                index = i;
//                products.set(index, prod);
//            }
//        }

            repo.save(prod);
    }

    public void deleteProduct(int productId) {
        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProductId() == productId) {
//                index = i;
//                products.remove(index);
//            }
//        }

            repo.deleteById(productId);
    }
}

