package com.skillstorm.quizapp.services;

import com.skillstorm.quizapp.dto.*;
import com.skillstorm.quizapp.models.Question;

import com.skillstorm.quizapp.repos.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;
    private final QuestionRepo questionRepo;

    public AnswerService(AnswerRepository answerRepository, QuestionRepo questionRepo) {
        this.answerRepository = answerRepository;
        this.questionRepo = questionRepo;
    }

    public ResultDTO gradeQuiz(List<AnswerDTO> answerDTOs) {
        int correctAnswersCount = 0;

        for (AnswerDTO answerDTO : answerDTOs) {
            Question question = questionRepo.findById(answerDTO.getQuestionId()).orElse(null);
            if (question != null && question.getCorrectAnswer().equalsIgnoreCase(answerDTO.getAnswer())) {
                correctAnswersCount++;
            }
        }

        ResultDTO result = new ResultDTO();
        result.setScore(correctAnswersCount);
        return result;
    }
}
