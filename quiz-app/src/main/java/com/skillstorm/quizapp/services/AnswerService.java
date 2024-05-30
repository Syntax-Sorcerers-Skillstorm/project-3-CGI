package com.skillstorm.quizapp.services;

import com.skillstorm.quizapp.dto.AnswerDTO;
import com.skillstorm.quizapp.dto.ResultDTO;
import com.skillstorm.quizapp.models.Answer;
import com.skillstorm.quizapp.models.Question;
import com.skillstorm.quizapp.repos.AnswerRepository;
import com.skillstorm.quizapp.repos.QuestionRepo;
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
        Long quizId = null;
        Long userId = null;

        for (AnswerDTO answerDTO : answerDTOs) {
            Question question = questionRepo.findById(answerDTO.getQuestionId()).orElse(null);
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
}
