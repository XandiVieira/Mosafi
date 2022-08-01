package com.relyon.mosafi.service;

import com.relyon.mosafi.model.Category;
import com.relyon.mosafi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void createCustomCategory(String category) {
    }

    public ResponseEntity<List<Category>> getCategories() {
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }
}