package com.iit_ase_coursework.product_service.repository;

import com.iit_ase_coursework.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
