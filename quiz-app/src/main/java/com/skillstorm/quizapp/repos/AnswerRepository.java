package com.skillstorm.quizapp.repos;


import com.skillstorm.quizapp.models.Answer;
import com.skillstorm.quizapp.models.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    // List<Question> findByCategory(String category);

    //     @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    // List<Question> findRandomQuestionsByCategory(String category, Integer numQ);
}
