package com.example.testSpring.controllers;

import com.example.testSpring.models.Product;
import com.example.testSpring.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    @GetMapping("/")
     public String homePage(Model model){
        model.addAttribute("products", ProductService.getList());
        return "home";
     }

     @GetMapping("/form")
     public String formPage(Model model){
        model.addAttribute("product", new Product());
        return "form";
     }
     @PostMapping("/product")
     public String productPage(@ModelAttribute Product product, Model model){
        ProductService.set(product.getName(),product.getPrice());
        return homePage(model);
     }
}
