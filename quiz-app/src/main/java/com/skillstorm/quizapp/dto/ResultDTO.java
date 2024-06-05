package com.skillstorm.quizapp.dto;

import java.util.List;

public class ResultDTO {
    private int score;
    private List<QuestionDTO> missedQuestions;

    public ResultDTO() {
    }

    public ResultDTO(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public List<QuestionDTO> getMissedQuestions() {
        return missedQuestions;
    }

    public void setMissedQuestions(List<QuestionDTO> missedQuestions) {
        this.missedQuestions = missedQuestions;
    }

    @Override
    public String toString() {
        return "ResultDTO [score=" + score + ", missedQuestions=" + missedQuestions + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + score;
        result = prime * result + ((missedQuestions == null) ? 0 : missedQuestions.hashCode());
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
        ResultDTO other = (ResultDTO) obj;
        if (score != other.score)
            return false;
        if (missedQuestions == null) {
            if (other.missedQuestions != null)
                return false;
        } else if (!missedQuestions.equals(other.missedQuestions))
            return false;
        return true;
    }




    
}
