package com.skillstorm.quizapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String correctAnswer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    public Question() {}

    public Question(Long questionId, String questionText, String option1, String option2, String option3, String correctAnswer, Quiz quiz) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.correctAnswer = correctAnswer;
        this.quiz = quiz;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
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

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "Question [questionId=" + questionId + ", questionText=" + questionText + ", option1=" + option1
                + ", option2=" + option2 + ", option3=" + option3 + ", correctAnswer=" + correctAnswer + ", quiz="
                + quiz + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
        result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
        result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
        result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
        result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
        result = prime * result + ((correctAnswer == null) ? 0 : correctAnswer.hashCode());
        result = prime * result + ((quiz == null) ? 0 : quiz.hashCode());
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
        if (questionId == null) {
            if (other.questionId != null)
                return false;
        } else if (!questionId.equals(other.questionId))
            return false;
        if (questionText == null) {
            if (other.questionText != null)
                return false;
        } else if (!questionText.equals(other.questionText))
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
        if (quiz == null) {
            if (other.quiz != null)
                return false;
        } else if (!quiz.equals(other.quiz))
            return false;
        return true;
    }

    
}
