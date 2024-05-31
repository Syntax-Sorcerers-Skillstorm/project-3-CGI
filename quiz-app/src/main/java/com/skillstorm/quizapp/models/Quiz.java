package com.skillstorm.quizapp.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;
    private String category;
    private String name;
    private Integer numberOfQuestions;
    private String description;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Question> questions;

    public Quiz() {
    }

    public Quiz(Long quizId, String category, String name, Integer numberOfQuestions, String description,
            List<Question> questions) {
        this.quizId = quizId;
        this.category = category;
        this.name = name;
        this.numberOfQuestions = numberOfQuestions;
        this.description = description;
        this.questions = questions;
    }

    

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz [quizId=" + quizId + ", category=" + category + ", name=" + name + ", numberOfQuestions="
                + numberOfQuestions + ", description=" + description + ", questions=" + questions + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((quizId == null) ? 0 : quizId.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((numberOfQuestions == null) ? 0 : numberOfQuestions.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((questions == null) ? 0 : questions.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quiz other = (Quiz) obj;
        if (quizId == null) {
            if (other.quizId != null)
                return false;
        } else if (!quizId.equals(other.quizId))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (numberOfQuestions == null) {
            if (other.numberOfQuestions != null)
                return false;
        } else if (!numberOfQuestions.equals(other.numberOfQuestions))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (questions == null) {
            if (other.questions != null)
                return false;
        } else if (!questions.equals(other.questions))
            return false;
        return true;
    }




}
