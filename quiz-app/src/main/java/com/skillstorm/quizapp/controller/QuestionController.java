package com.skillstorm.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.skillstorm.quizapp.dto.QuestionDTO;
import com.skillstorm.quizapp.services.QuestionService;

@CrossOrigin
@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<QuestionDTO> all() {
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuestionDTO> one(@PathVariable Long id) {
        QuestionDTO questionDTO = questionService.findById(id);
        if (questionDTO != null) {
            return ResponseEntity.ok(questionDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<QuestionDTO>> getRandomQuestionsByCategory(@PathVariable Long categoryId) {
        List<QuestionDTO> questions = questionService.findRandomQuestionsByCategory(categoryId);
        return ResponseEntity.ok(questions);
    }


    @GetMapping("/random")
    public List<QuestionDTO> getAllRandQuests() {
        return questionService.findAllRandQuests();
    }
}


