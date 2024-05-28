package com.skillstorm.quizapp.controller;

import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.skillstorm.quizapp.models.Question;
import com.skillstorm.quizapp.services.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // Get list of all questions
    @GetMapping //filter by quiz instead of all
    public List<Question> all() {
        return questionService.findAll();
    }

    // Get question by id
    @GetMapping("/{id}")
    public ResponseEntity<Question> one(@PathVariable Long id) {
        Question question = questionService.findById(id);
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    
    // Add question
    @PostMapping
    public ResponseEntity<Question> newQuestion(@RequestBody Question newQuestion) {
        Question question = questionService.save(newQuestion);
        return ResponseEntity.status(HttpStatus.CREATED).body(question);
    }

    // Edit question
    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(@RequestBody Question updatedQuestion, @PathVariable Long id) {
        Question question = questionService.findById(id);
        if (question != null) {
            updatedQuestion.setQuestionId(id); // Ensure the ID is set correctly
            questionService.save(updatedQuestion);
            return ResponseEntity.ok(updatedQuestion);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Delete question
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        if (questionService.findById(id) != null) { 
            questionService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
