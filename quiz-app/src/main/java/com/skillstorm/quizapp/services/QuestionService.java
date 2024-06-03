package com.skillstorm.quizapp.services;

import org.springframework.stereotype.Service;
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

    public List<QuestionDTO> findAll() {
        return questionRepo.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public QuestionDTO findById(Long questionId) {
        Optional<Question> question = questionRepo.findById(questionId);
        return question.map(this::convertToDTO).orElse(null);
    }

    public List<QuestionDTO> findRandomQuestionsByCategory(Long categoryId) {
        return questionRepo.findRandomQuestionsByCategory(categoryId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private QuestionDTO convertToDTO(Question question) {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestionId(question.getQuestionId());
        questionDTO.setCategoryId(question.getCategoryId().getCategoryId());
        questionDTO.setQuestionText(question.getQuestionText());
        questionDTO.setOption1(question.getOption1());
        questionDTO.setOption2(question.getOption2());
        questionDTO.setOption3(question.getOption3());
        return questionDTO;
    }

    private Question convertToEntity(QuestionDTO questionDTO) {
        Question question = new Question();
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
