/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.tiendaliz.service;

import com.pablinchapin.tiendaliz.model.Category;
import com.pablinchapin.tiendaliz.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pvargas
 */
@Service
public class CategoryServiceBean implements CategoryService{
    
    private CategoryRepository categoryRepository;
    
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Iterable<Category> listAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    
}