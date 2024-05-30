package com.skillstorm.quizapp.controller;

import com.skillstorm.quizapp.dto.QuizDTO;
import com.skillstorm.quizapp.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<QuizDTO> getAllQuizzes() {
        return quizService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuizDTO> getQuizById(@PathVariable Long id) {
        QuizDTO quiz = quizService.findById(id);
        return quiz != null ? ResponseEntity.ok(quiz) : ResponseEntity.notFound().build();
    }
}
