package com.iit_ase_coursework.product_service.controller;

import com.iit_ase_coursework.product_service.model.Product;
import com.iit_ase_coursework.product_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("/product")
    public List<Product> get(){
        return this.productService.getProduct();
    }
    @GetMapping("/product/{productId}")
    public Product get(@PathVariable int productId){
        return this.productService.getProduct(productId);
    }
    @PostMapping("/product")
    public void crete(@RequestBody Product product){
         this.productService.createProduct(product);
    }
    @PatchMapping("/product")
    public void update(@RequestBody Product product){
        this.productService.updateProduct(product);
    }
    @DeleteMapping("/product/{productId}")
    public void delete(@PathVariable int productId){
        this.productService.deleteProduct(productId);
    }
}
