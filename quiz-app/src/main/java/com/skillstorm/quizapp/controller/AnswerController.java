package com.skillstorm.quizapp.controller;

import com.skillstorm.quizapp.dto.AnswerDTO;
import com.skillstorm.quizapp.dto.ResultDTO;
import com.skillstorm.quizapp.services.AnswerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/answers")
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }
    @CrossOrigin
    @PostMapping("/submit")
    public ResponseEntity<ResultDTO> submitQuiz(@RequestBody List<AnswerDTO> answers) {
        ResultDTO result = answerService.gradeQuiz(answers);
        return ResponseEntity.ok(result);
    }
}
