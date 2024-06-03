package com.skillstorm.quizapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(nullable = false)
    private String answer;

    public Answer() {}

    public Answer(Long answerId, Question question, String answer) {
        this.answerId = answerId;
        this.question = question;
        this.answer = answer;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer [answerId=" + answerId + ", question=" + question + ", answer=" + answer + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((answerId == null) ? 0 : answerId.hashCode());
        result = prime * result + ((question == null) ? 0 : question.hashCode());
        result = prime * result + ((answer == null) ? 0 : answer.hashCode());
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
        Answer other = (Answer) obj;
        if (answerId == null) {
            if (other.answerId != null)
                return false;
        } else if (!answerId.equals(other.answerId))
            return false;
        if (question == null) {
            if (other.question != null)
                return false;
        } else if (!question.equals(other.question))
            return false;
        if (answer == null) {
            if (other.answer != null)
                return false;
        } else if (!answer.equals(other.answer))
            return false;
        return true;
    }

    
}
