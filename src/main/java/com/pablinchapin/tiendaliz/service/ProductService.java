/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.tiendaliz.service;

import com.pablinchapin.tiendaliz.model.Product;

/**
 *
 * @author pvargas
 */
public interface ProductService {
    
    Product saveProduct(Product product);
    
    Iterable<Product> listAllProducts();
    
    Product getProductById(Integer id);
    
    Iterable<Product> listAllProductsByCategoryId(Integer id);
        
}