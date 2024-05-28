package com.skillstorm.quizapp.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.quizapp.models.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Long> {
}