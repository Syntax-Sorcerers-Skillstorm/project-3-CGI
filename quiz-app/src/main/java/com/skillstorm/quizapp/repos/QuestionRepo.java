package com.skillstorm.quizapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.skillstorm.quizapp.models.Question;
import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {

    List<Question> findByCategory(String category);

//     @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND()", nativeQuery = true)
//     List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
// }
@Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);}
