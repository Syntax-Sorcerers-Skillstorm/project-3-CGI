package com.skillstorm.quizapp.services;

import com.skillstorm.quizapp.dto.*;
import com.skillstorm.quizapp.models.*;
import com.skillstorm.quizapp.repos.*;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    private final QuizRepo quizRepository;
    private final QuestionRepo questionRepository;

    public QuizService(QuizRepo quizRepository, QuestionRepo questionRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
    }

    // Method to get all quizzes
    public List<QuizDTO> findAll() {
        List<Quiz> quizzes = quizRepository.findAll();
        return quizzes.stream().map(this::convertToDTO).toList();
    }

    // Method to get a quiz by its ID
    public QuizDTO findById(Long id) {
        Optional<Quiz> quizOptional = quizRepository.findById(id);
        return quizOptional.map(this::convertToDTO).orElse(null);
    }

    // Method to grade a quiz based on the submitted answers
    public ResultDTO gradeQuiz(List<AnswerDTO> answers) {
        int correctAnswersCount = 0;
        Long quizId = null;
        Long userId = null; // You can adjust this based on your authentication logic

        for (AnswerDTO answerDTO : answers) {
            Question question = questionRepository.findById(answerDTO.getQuestionId()).orElse(null);
            if (question != null) {
                quizId = question.getQuiz().getQuizId();
                if (question.getCorrectAnswer().equalsIgnoreCase(answerDTO.getAnswer())) {
                    correctAnswersCount++;
                }
            }
        }

        ResultDTO result = new ResultDTO();
        result.setQuizId(quizId);
        result.setUserId(userId);
        result.setScore(correctAnswersCount);
        return result;
    }

    // Helper method to convert a Quiz entity to a QuizDTO
    private QuizDTO convertToDTO(Quiz quiz) {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setQuizId(quiz.getQuizId());
        quizDTO.setCategory(quiz.getCategory());
        quizDTO.setName(quiz.getName());
        quizDTO.setNumberOfQuestions(quiz.getQuestions().size());
        return quizDTO;
    }
}
