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

    @GetMapping
    public List<Question> all() {
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> one(@PathVariable Long id) {
        Question question = questionService.findById(id);
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<Question> newQuestion(@RequestBody Question newQuestion) {
        Question question = questionService.save(newQuestion);
        return ResponseEntity.status(HttpStatus.CREATED).body(question);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(@RequestBody Question updatedQuestion, @PathVariable Long id) {
        Question question = questionService.findById(id);
        if (question != null) {
            updatedQuestion.setQuestionId(id);
            questionService.save(updatedQuestion);
            return ResponseEntity.ok(updatedQuestion);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        if (questionService.findById(id) != null) {
            questionService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // @GetMapping("/category/{category}")
    // public ResponseEntity<List<Question>> getRandomQuestionsByCategory(@PathVariable String category) {
    //     List<Question> questions = questionService.findRandomQuestionsByCategory(category, 10);
    //     return ResponseEntity.ok(questions);
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getRandomQuestionsByCategory(@PathVariable Category category) {
        List<Question> questions = questionService.findRandomQuestionsByCategory(category, 10);
        return ResponseEntity.ok(questions);
    }
    // }
}
