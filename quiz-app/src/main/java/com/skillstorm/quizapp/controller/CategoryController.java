package com.skillstorm.quizapp.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.skillstorm.quizapp.services.CategoryService;
@CrossOrigin
@RestController
@RequestMapping("/questions")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{categoryId}/description")
    public ResponseEntity<String> getCategoryDescription(@PathVariable Long categoryId) {
        return categoryService.findById(categoryId)
            .map(category -> ResponseEntity.ok(category.getDescription()))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category not found"));
    }
}

    // http://localhost:8080/questions/{categoryId}/description


