package com.skillstorm.quizapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
//lombok will generate setter/getters and constructors
@Data
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionId;
    private String category;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String correctAnswer;

}