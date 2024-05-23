package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.skillstorm.quizapp.models.Question;
import com.skillstorm.quizapp.repos.QuestionRepo;

@Service
public class QuestionService {
    private final QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    // Get list of all questions
    public List<Question> findAll() {
        return questionRepo.findAll();
    }

    // Get question by id
    public Question findById(Long id) {
        Optional<Question> question = questionRepo.findById(id);
        return question.orElse(null);
    }

    // Add or update question
    public Question save(Question question) {
        return questionRepo.save(question);
    }

    // Delete question by id
    public void deleteById(Long id) {
        questionRepo.deleteById(id);
    }
}