package com.relyon.mosafi.service;

import com.relyon.mosafi.exception.AlreadyExistsException;
import com.relyon.mosafi.exception.ResourceNotFoundException;
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

    public ResponseEntity<Object> createCustomCategory(String category) {
        if (categoryRepository.existsByNameIgnoreCase(category)) {
            throw new AlreadyExistsException("Category already exists.");
        }
        return new ResponseEntity<>(categoryRepository.save(new Category(category)), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()) {
            throw new ResourceNotFoundException("No categories were found.");
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}