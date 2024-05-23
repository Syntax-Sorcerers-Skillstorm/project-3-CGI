package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.skillstorm.quizapp.models.Questions;
import com.skillstorm.quizapp.repos.QuestionRepo;

@Service
public class QuestionService {
    private final QuestionRepo QuestionRepo;

    public QuestionService(QuestionRepo QuestionRepo) {
        this.QuestionRepo = QuestionRepo;
    }

    // Get list of all questions
    public List<Questions> findAll() {
        return QuestionRepo.findAll();
    }

    // Get question by id
    public Questions findById(Long id) {
        Optional<Questions> question = QuestionRepo.findById(id);
        return question.orElse(null);
    }

    // Add or update question
    public Questions save(Questions question) {
        return QuestionRepo.save(question);
    }

    // Delete question by id
    public void deleteById(Long id) {
        QuestionRepo.deleteById(id);
    }
}