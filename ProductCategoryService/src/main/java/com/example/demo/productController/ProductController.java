package com.example.demo.productController;

import com.example.demo.models.Product;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {
    @GetMapping
    public Product getAllProducts(){
        return new Product("Nike", "9000");
    }
}
