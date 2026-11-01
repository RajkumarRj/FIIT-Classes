package com.example.layers.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.layers.model.Product;

@Repository 
public class Productrepo {

    private final List<Product> products = new ArrayList<>();

    private long count = 1;

    
    public Productrepo(){
        products.add(new Product(count++ , "Laptop", 100 ));

        products.add(new Product(count++ , "Phone", 400 ));
    }


    public List<Product> getProduct(){

        return products;
    }


    public List<Product> save(Product product){

        products.add(product);

        return products;
    }



    
    
}


