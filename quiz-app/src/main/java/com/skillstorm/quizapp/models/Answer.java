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

    @Column(nullable = false)
    private Long userId;

    public Answer() {}

    public Answer(Long answerId, Question question, String answer, Long userId) {
        this.answerId = answerId;
        this.question = question;
        this.answer = answer;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Answer [answerId=" + answerId + ", question=" + question + ", answer=" + answer + ", userId=" + userId
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((answerId == null) ? 0 : answerId.hashCode());
        result = prime * result + ((question == null) ? 0 : question.hashCode());
        result = prime * result + ((answer == null) ? 0 : answer.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
    }

    

    
}
