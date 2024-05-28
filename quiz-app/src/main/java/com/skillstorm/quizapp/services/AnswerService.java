package com.skillstorm.quizapp.services;

import com.skillstorm.quizapp.dto.*;
import com.skillstorm.quizapp.models.*;
import com.skillstorm.quizapp.repos.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public ResultDTO gradeQuiz(List<AnswerDTO> answerDTOs) {
        // Convert AnswerDTOs to Answer entities and save them
        List<Answer> answers = answerDTOs.stream()
                .map(dto -> new Answer(dto.getQuestionId(), dto.getAnswer(), dto.getUserId())) // assuming userId is null or you
                .toList();
        answerRepository.saveAll(answers);

        // grade the quiz and return the result
        return new ResultDTO();
    }
}
