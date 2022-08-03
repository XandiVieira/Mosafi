package com.relyon.mosafi.controller;

import com.relyon.mosafi.model.Category;
import com.relyon.mosafi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/{category}")
    public ResponseEntity<Object> createCategory(@PathVariable("category") String category) {
        return categoryService.createCustomCategory(category);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return categoryService.getCategories();
    }
}