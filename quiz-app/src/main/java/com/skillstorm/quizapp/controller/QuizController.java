package com.skillstorm.quizapp.controller;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.skillstorm.quizapp.dto.*;
import com.skillstorm.quizapp.services.QuizService;


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
    public ResponseEntity<QuizDTO> getQuizById(@PathVariable Long quizId) {
        QuizDTO quiz = quizService.findById(quizId);
        return quiz != null ? ResponseEntity.ok(quiz) : ResponseEntity.notFound().build();
    }

    @PostMapping("/submit")
    public ResponseEntity<ResultDTO> submitQuiz(@RequestBody List<AnswerDTO> answer) {
        ResultDTO result = quizService.gradeQuiz(answer);
        return ResponseEntity.ok(result);
    }
}
