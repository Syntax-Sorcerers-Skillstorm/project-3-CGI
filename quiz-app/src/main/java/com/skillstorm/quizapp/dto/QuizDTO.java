package com.skillstorm.quizapp.dto;

public class QuizDTO {
    private Long quizId;
    private Long categoryId;
    private String name;
    private Integer numberOfQuestions;
    private String description;
    
    public QuizDTO() {
    }

    public QuizDTO(Long quizId, Long categoryId, String name, Integer numberOfQuestions, String description) {
        this.quizId = quizId;
        this.categoryId = categoryId;
        this.name = name;
        this.numberOfQuestions = numberOfQuestions;
        this.description = description;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return "QuizDTO [quizId=" + quizId + ", categoryId=" + categoryId + ", name=" + name + ", numberOfQuestions="
                + numberOfQuestions + ", description=" + description + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((quizId == null) ? 0 : quizId.hashCode());
        result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((numberOfQuestions == null) ? 0 : numberOfQuestions.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        QuizDTO other = (QuizDTO) obj;
        if (quizId == null) {
            if (other.quizId != null)
                return false;
        } else if (!quizId.equals(other.quizId))
            return false;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        } else if (!categoryId.equals(other.categoryId))
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
        return true;
    }

    

}
