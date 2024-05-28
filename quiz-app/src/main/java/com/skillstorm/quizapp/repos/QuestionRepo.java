package com.skillstorm.quizapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.quizapp.models.Question;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long quizId);
}
