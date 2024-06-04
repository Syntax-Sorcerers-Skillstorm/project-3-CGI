package com.skillstorm.quizapp.dto;

public class ResultDTO {
    private int score;

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

    @Override
    public String toString() {
        return "ResultDTO [score=" + score + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + score;
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
        return true;
    }

    
}
