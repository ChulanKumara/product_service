package com.iit_ase_coursework.product_service.service;

import com.iit_ase_coursework.product_service.model.Product;
import com.iit_ase_coursework.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public int createProduct(Product product) {
        return this.productRepository.save(product).getProductId();
    }

    @Override
    public void updateProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProduct(int productId) {
        return this.productRepository.findById(productId).get();
    }

    @Override
    public void deleteProduct(int productId) {
        this.productRepository.deleteById(productId);
    }
}
