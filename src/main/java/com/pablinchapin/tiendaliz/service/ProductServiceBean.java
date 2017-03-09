/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.tiendaliz.service;

import com.pablinchapin.tiendaliz.model.Product;
import com.pablinchapin.tiendaliz.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pvargas
 */
@Service
public class ProductServiceBean implements ProductService {
    
    private ProductRepository productRepository;
    
    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Iterable<Product> listAllProductsByCategoryId(Integer id) {
        return productRepository.findByCategoryId(id);
    }
    
}
