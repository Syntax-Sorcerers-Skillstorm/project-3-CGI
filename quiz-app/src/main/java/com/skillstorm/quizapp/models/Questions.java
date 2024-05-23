package com.skillstorm.quizapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Questions {
    // @ManyToOne
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long questionId;
    String category;
    String question;
    String option1;
    String option2;
    String option3;
    String correctAnswer;

}
