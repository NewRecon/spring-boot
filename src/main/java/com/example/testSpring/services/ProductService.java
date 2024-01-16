package com.example.testSpring.services;

import com.example.testSpring.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    static private long id = 0;
    static private List<Product> products = new ArrayList<>();
    {
        products.add(new Product(++id,"Burger",78));
        products.add(new Product(++id,"Roll",70));
        products.add(new Product(++id,"Cola",60));
    }
    static public List<Product> getList(){
        return products;
    }

    static public void set(String name, float price){
        products.add(new Product(++id,name,price));
    }
}
