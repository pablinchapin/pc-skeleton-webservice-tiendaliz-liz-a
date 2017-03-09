/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.tiendaliz.repository;

import com.pablinchapin.tiendaliz.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author pvargas
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
    Iterable<Product> findByCategoryId(Integer id);
    
}