package com.iit_ase_coursework.product_service.service;

import com.iit_ase_coursework.product_service.model.Product;

import java.util.List;

public interface IProductService {
    public int createProduct(Product product);
    public void updateProduct(Product product);
    public List<Product> getProduct();
    public Product getProduct(int productId);
    public void deleteProduct(int productId);
    
}
