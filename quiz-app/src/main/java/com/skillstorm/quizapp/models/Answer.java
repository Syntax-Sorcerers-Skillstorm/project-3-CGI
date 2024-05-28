package com.skillstorm.quizapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    // @Column(nullable = false)
    // private Long questionId;
    
    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "questionId")
    private Question questionId;

    @Column(nullable = false)
    private String answer;

    @Column(nullable = false)
    private Long userId; // keep track of which user submitted the answer

    public Answer() {
    }

    public Answer(Question questionId, String answer, Long userId) {
        this.questionId = questionId;
        this.answer = answer;
        this.userId = userId;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Answer [answerId=" + answerId + ", questionId=" + questionId + ", answer=" + answer + ", userId="
                + userId + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((answerId == null) ? 0 : answerId.hashCode());
        result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
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
        if (questionId == null) {
            if (other.questionId != null)
                return false;
        } else if (!questionId.equals(other.questionId))
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
