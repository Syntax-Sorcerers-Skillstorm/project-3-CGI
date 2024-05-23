package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.skillstorm.quizapp.models.Question;
import com.skillstorm.quizapp.repos.QuestionRepo;

@Service
public class QuestionService {
    private final QuestionRepo QuestionRepo;

    public QuestionService(QuestionRepo QuestionRepo) {
        this.QuestionRepo = QuestionRepo;
    }

    // Get list of all questions
    public List<Question> findAll() {
        return QuestionRepo.findAll();
    }

    // Get question by id
    public Question findById(Long id) {
        Optional<Question> question = QuestionRepo.findById(id);
        return question.orElse(null);
    }

    // Add or update question
    public Question save(Question question) {
        return QuestionRepo.save(question);
    }

    // Delete question by id
    public void deleteById(Long id) {
        QuestionRepo.deleteById(id);
    }
}