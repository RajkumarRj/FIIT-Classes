package com.example.layers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.layers.model.Product;
import com.example.layers.repository.Productrepo;

@Service 
public class ProductService {

    // tight coupling -> loose coupling
    // depdency injection 

    // field injection 
    // setter injection 
    // constructor inejction 

    @Autowired 
    private Productrepo repo ;



    public List<Product> getProduct(){

        return repo.getProduct();
    }


    public List<Product> addProduct(Product product){

        return repo.save(product);

    }









    
}
