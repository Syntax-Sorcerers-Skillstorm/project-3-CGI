package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.skillstorm.quizapp.dto.QuestionDTO;
import com.skillstorm.quizapp.models.Question;
import com.skillstorm.quizapp.models.Category;
import com.skillstorm.quizapp.repos.QuestionRepo;
import com.skillstorm.quizapp.repos.CategoryRepo;

@Service
public class QuestionService {
    private final QuestionRepo questionRepo;
    private final CategoryRepo categoryRepo;

    public QuestionService(QuestionRepo questionRepo, CategoryRepo categoryRepo) {
        this.questionRepo = questionRepo;
        this.categoryRepo = categoryRepo;

    }

    public List<QuestionDTO> findAllRandQuests() {
        List<QuestionDTO> allQuestions = findAll();
        Collections.shuffle(allQuestions);
        return allQuestions; // Return all questions in randomized order
    }

    public List<QuestionDTO> findAll() {
        return questionRepo.findAll().stream()
                .map(this::questionToDTO)
                .collect(Collectors.toList());
    }

    public QuestionDTO findById(Long questionId) {
        Optional<Question> question = questionRepo.findById(questionId);
        return question.map(this::questionToDTO).orElse(null);
    }

    // take a list of questions put them in stream, map to dto (using method i
    // created below), turn them back to a list of dtos
    public List<QuestionDTO> findRandomQuestionsByCategory(Long categoryId) {
        return questionRepo.findRandomQuestionsByCategory(categoryId).stream()
                // .map(question -> this.convertToDTO(question))
                .map(this::questionToDTO)// method ref to this(this service class) questionToDTO method
                .collect(Collectors.toList()); // collect- terminal operation that converts the stream back into a list.
    }// streams aren't triggered until terminal op is encountered

    QuestionDTO questionToDTO(Question question) {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestionId(question.getQuestionId());
        questionDTO.setCategoryId(question.getCategoryId().getCategoryId());
        questionDTO.setQuestionText(question.getQuestionText());
        questionDTO.setOption1(question.getOption1());
        questionDTO.setOption2(question.getOption2());
        questionDTO.setOption3(question.getOption3());
        return questionDTO;
    }

    // returns a Question, takes a QuestionDTO as param.
    @SuppressWarnings("unused")
    private Question dtoToEntity(QuestionDTO questionDTO) {

        Question question = new Question();
        // dto fields get copied into new question obj
        question.setQuestionId(questionDTO.getQuestionId());
        question.setQuestionText(questionDTO.getQuestionText());
        question.setOption1(questionDTO.getOption1());
        question.setOption2(questionDTO.getOption2());
        question.setOption3(questionDTO.getOption3());

        Category category = categoryRepo.findById(questionDTO.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        question.setCategoryId(category);
        return question;
    }

    
}
