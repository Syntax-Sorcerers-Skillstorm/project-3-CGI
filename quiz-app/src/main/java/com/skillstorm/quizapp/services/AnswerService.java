package com.skillstorm.quizapp.services;

import com.skillstorm.quizapp.dto.*;
import com.skillstorm.quizapp.models.Question;
import com.skillstorm.quizapp.repos.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerService {

    @SuppressWarnings("unused")
    private final AnswerRepository answerRepository;
    private final QuestionRepo questionRepo;
    private final QuestionService questionService;

    public AnswerService(AnswerRepository answerRepository, QuestionRepo questionRepo, QuestionService questionService) {
        this.answerRepository = answerRepository;
        this.questionRepo = questionRepo;
        this.questionService = questionService;
    }

    public ResultDTO gradeQuiz(List<AnswerDTO> answerDTOs) {
        //where we will keep track of correct answers
        int correctAnswersCount = 0;
        List<QuestionDTO> missedQuestions = new ArrayList<>();

        for (AnswerDTO answerDTO : answerDTOs) {
            Question question = questionRepo.findById(answerDTO.getQuestionId()).orElse(null);
            //compares correct answer to answerDTO (user answers)
            if (question != null && question.getCorrectAnswer().equalsIgnoreCase(answerDTO.getAnswer())) {
                //increment for every correct answer
                correctAnswersCount++;
            } else if (question != null) {
                missedQuestions.add(questionService.questionToDTO(question));
            }
        }
        
        // Create the result object and set the score and missed questions
        ResultDTO result = new ResultDTO();
        result.setScore(correctAnswersCount);
        result.setMissedQuestions(missedQuestions);
        return result;
    }
}
