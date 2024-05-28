package com.skillstorm.quizapp.dto;

public class QuestionDTO {
        private Integer questionId;
        private String category;
        private String name;
        private Integer numberOfQuestions;

        public QuestionDTO() {
        }

        public QuestionDTO(Integer questionId, String category, String name, Integer numberOfQuestions) {
                this.questionId = questionId;
                this.category = category;
                this.name = name;
                this.numberOfQuestions = numberOfQuestions;
        }

        

        public Integer getQuestionId() {
                return questionId;
        }

        public void setQuestionId(Integer questionId) {
                this.questionId = questionId;
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

        @Override
        public String toString() {
                return "QuestionDTO [questionId=" + questionId + ", category=" + category + ", name=" + name
                                + ", numberOfQuestions=" + numberOfQuestions + "]";
        }

        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
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
                QuestionDTO other = (QuestionDTO) obj;
                if (questionId == null) {
                        if (other.questionId != null)
                                return false;
                } else if (!questionId.equals(other.questionId))
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
