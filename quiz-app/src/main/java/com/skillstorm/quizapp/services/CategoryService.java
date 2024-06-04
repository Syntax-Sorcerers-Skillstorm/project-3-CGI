package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.skillstorm.quizapp.models.Category;
import com.skillstorm.quizapp.repos.CategoryRepo;

@Service
public class CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Optional<Category> findById(Long categoryId) {
        return categoryRepo.findById(categoryId);
    }
}

