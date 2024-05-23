package com.skillstorm.quizapp.repos;

import org.springframework.data.jpa.repository.*;

import com.skillstorm.quizapp.models.Question;;

public interface QuestionRepo extends JpaRepository<Question, Long> {
// data paging and sorting,
}