package com.skillstorm.quizapp.repos;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.skillstorm.quizapp.models.*;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {

    List<Question> findByCategoryId(Category categoryId);

    //custom query to get questions by category
    @Query(value = "SELECT * FROM question WHERE question.category_id = :category_id ORDER BY RAND()", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(@Param("category_id") Long categoryId);
}
