/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.tiendaliz.service;

import com.pablinchapin.tiendaliz.model.Category;

/**
 *
 * @author pvargas
 */
public interface CategoryService {
    
    Iterable<Category> listAllCategories();
    
    Category getCategoryById(Integer id);
    
    Category saveCategory(Category category);
    
}
