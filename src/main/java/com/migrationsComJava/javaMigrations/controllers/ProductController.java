package com.migrationsComJava.javaMigrations.controllers;

import com.migrationsComJava.javaMigrations.domain.product.Product;
import com.migrationsComJava.javaMigrations.domain.product.ProductDTO;
import com.migrationsComJava.javaMigrations.domain.product.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping()
    public ResponseEntity getAllProducts(){
        List<Product> allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping()
    public ResponseEntity createProduct(@RequestBody @Valid ProductDTO productDTO){

        Product productToSave = new Product(productDTO);

        repository.save(productToSave);

        return ResponseEntity.ok(productDTO);
    }
}
