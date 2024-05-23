package com.skillstorm.quizapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
//import lombok.Data;

@Entity

public class Question {
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
    public Question() {
    }
    public Question(long questionId, String category, String question, String option1, String option2, String option3,
            String correctAnswer) {
        this.questionId = questionId;
        this.category = category;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.correctAnswer = correctAnswer;
    }
    public long getQuestionId() {
        return questionId;
    }
    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOption1() {
        return option1;
    }
    public void setOption1(String option1) {
        this.option1 = option1;
    }
    public String getOption2() {
        return option2;
    }
    public void setOption2(String option2) {
        this.option2 = option2;
    }
    public String getOption3() {
        return option3;
    }
    public void setOption3(String option3) {
        this.option3 = option3;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public String toString() {
        return "Question [questionId=" + questionId + ", category=" + category + ", question=" + question + ", option1="
                + option1 + ", option2=" + option2 + ", option3=" + option3 + ", correctAnswer=" + correctAnswer + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (questionId ^ (questionId >>> 32));
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((question == null) ? 0 : question.hashCode());
        result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
        result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
        result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
        result = prime * result + ((correctAnswer == null) ? 0 : correctAnswer.hashCode());
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
        Question other = (Question) obj;
        if (questionId != other.questionId)
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (question == null) {
            if (other.question != null)
                return false;
        } else if (!question.equals(other.question))
            return false;
        if (option1 == null) {
            if (other.option1 != null)
                return false;
        } else if (!option1.equals(other.option1))
            return false;
        if (option2 == null) {
            if (other.option2 != null)
                return false;
        } else if (!option2.equals(other.option2))
            return false;
        if (option3 == null) {
            if (other.option3 != null)
                return false;
        } else if (!option3.equals(other.option3))
            return false;
        if (correctAnswer == null) {
            if (other.correctAnswer != null)
                return false;
        } else if (!correctAnswer.equals(other.correctAnswer))
            return false;
        return true;
    }
}
