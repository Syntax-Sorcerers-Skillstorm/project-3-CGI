package com.skillstorm.quizapp.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.quizapp.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}

