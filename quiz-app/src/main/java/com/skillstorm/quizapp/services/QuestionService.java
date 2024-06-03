package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.skillstorm.quizapp.models.*;
import com.skillstorm.quizapp.repos.QuestionRepo;

@Service
public class QuestionService {
    private final QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<Question> findAll() {
        return questionRepo.findAll();
    }

    public Question findById(Long questionId) {
        Optional<Question> question = questionRepo.findById(questionId);
        return question.orElse(null);
    }

    public List<Question> findRandomQuestionsByCategory(Long categoryId) {
        return questionRepo.findRandomQuestionsByCategory(categoryId);
    }
}
