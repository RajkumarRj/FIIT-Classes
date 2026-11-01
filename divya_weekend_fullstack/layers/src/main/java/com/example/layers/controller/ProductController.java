package com.example.layers.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.layers.model.Product;
import com.example.layers.service.ProductService;

@RestController 
public class ProductController {

    // constructor injection 
    private  ProductService service ;

    public ProductController(ProductService service){
        this.service = service;
    }


    @GetMapping("/product")
    public List<Product> showProduct(){

        return service.getProduct();
    }

    @PostMapping("/product")
    public List<Product> createProduct(@RequestBody  Product product){


        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getStock());

        return service.addProduct(product);

    }
    


    // java object -> json (jackson )

    @GetMapping("/")
    public String sayHello(){
        return "Welcome ..";
    }


    

    
}


