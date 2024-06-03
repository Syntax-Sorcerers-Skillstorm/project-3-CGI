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

    public List<Question> findAll() {
        return questionRepo.findAll();
    }

    public Question findById(Long questionId) {
        Optional<Question> question = questionRepo.findById(questionId);
        return question.orElse(null);
    }

    public Question save(Question question) {
        return questionRepo.save(question);
    }

    public void deleteById(Long questionId) {
        questionRepo.deleteById(questionId);
    }

    // public List<Question> findRandomQuestionsByCategory(String category, int numQ) {
    //     return questionRepo.findRandomQuestionsByCategory(category, numQ);
    // }

    public List<Question> findRandomQuestionsByCategory(String category) {
        return questionRepo.findRandomQuestionsByCategory(category, 10);
    }
}
