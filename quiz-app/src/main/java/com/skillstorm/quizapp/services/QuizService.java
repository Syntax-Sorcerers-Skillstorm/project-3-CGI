package com.skillstorm.quizapp.services;

import com.skillstorm.quizapp.dto.QuizDTO;
import com.skillstorm.quizapp.models.Quiz;
import com.skillstorm.quizapp.repos.QuizRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    private final QuizRepo quizRepository;

    public QuizService(QuizRepo quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<QuizDTO> findAll() {
        List<Quiz> quizzes = quizRepository.findAll();
        return quizzes.stream().map(this::convertToDTO).toList();
    }

    public QuizDTO findById(Long id) {
        Optional<Quiz> quizOptional = quizRepository.findById(id);
        return quizOptional.map(this::convertToDTO).orElse(null);
    }

    private QuizDTO convertToDTO(Quiz quiz) {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setQuizId(quiz.getQuizId());
        quizDTO.setCategory(quiz.getCategory());
        quizDTO.setName(quiz.getName());
        quizDTO.setNumberOfQuestions(quiz.getQuestions().size());
        return quizDTO;
    }
}
