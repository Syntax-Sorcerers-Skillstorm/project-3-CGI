package com.skillstorm.quizapp.models;

import jakarta.persistence.*;
import java.util.List;

//encapsulates the quiz details, dto responsible forÍ transfering data between client and server
@Entity
@Table(name = "quizzes")
public class Quiz {
    // @OneToMany
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long quizId;
    private String category;
    private String name;
    private Integer numberOfQuestions;

    // Each quiz can have multiple questions.
    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;

    public Quiz() {
    }

    public Quiz(Long quizId, String category, String name, Integer numberOfQuestions) {
        this.quizId = quizId;
        this.category = category;
        this.name = name;
        this.numberOfQuestions = numberOfQuestions;
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

        // public List<Question> getQuestions() {
        // return this.questions;
        // }

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
                + numberOfQuestions + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((quizId == null) ? 0 : quizId.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((numberOfQuestions == null) ? 0 : numberOfQuestions.hashCode());
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
        return true;
    }

}
