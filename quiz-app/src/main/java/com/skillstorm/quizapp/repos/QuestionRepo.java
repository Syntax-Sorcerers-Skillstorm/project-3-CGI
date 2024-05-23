package com.skillstorm.quizapp.repos;

import org.springframework.data.jpa.repository.*;

import com.skillstorm.quizapp.models.Questions;

public interface QuestionRepo extends JpaRepository<Questions, Long> {
// data paging and sorting,
}