package com.skillstorm.quizapp.controller;

import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.skillstorm.quizapp.models.*;

import com.skillstorm.quizapp.services.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> all() {
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> one(@PathVariable Long questionId) {
        Question question = questionService.findById(questionId);
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Question>> getRandomQuestionsByCategory(@PathVariable Long categoryId) {
        List<Question> questions = questionService.findRandomQuestionsByCategory(categoryId);
        return ResponseEntity.ok(questions);
    }

}
