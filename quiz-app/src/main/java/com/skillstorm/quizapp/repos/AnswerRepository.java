package com.skillstorm.quizapp.repos;

import com.skillstorm.quizapp.models.Answer;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
