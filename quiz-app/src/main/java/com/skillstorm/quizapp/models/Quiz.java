package com.skillstorm.quizapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
// import lombok.Data;

@Entity

public class Quiz {
    // @OneToMany
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String category;

}
