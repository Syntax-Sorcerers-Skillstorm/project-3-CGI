package com.skillstorm.quizapp.dto;

import com.skillstorm.quizapp.models.Category;

public class QuestionDTO {
        private Integer questionId;
        private Category categoryId;
        private String questionText;
        private String option1;
        private String option2;
        private String option3;

        public Integer getQuestionId() {
                return questionId;
        }

        public QuestionDTO(Integer questionId, Category categoryId, String questionText, String option1, String option2,
                        String option3) {
                this.questionId = questionId;
                this.categoryId = categoryId;
                this.questionText = questionText;
                this.option1 = option1;
                this.option2 = option2;
                this.option3 = option3;
        }

        public void setQuestionId(Integer questionId) {
                this.questionId = questionId;
        }

        public Category getCategoryId() {
                return categoryId;
        }

        public void setCategoryId(Category categoryId) {
                this.categoryId = categoryId;
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

        public QuestionDTO() {
        }


        @Override
        public String toString() {
                return "QuestionDTO [questionId=" + questionId + ", questionText=" + questionText + ", option1="
                                + option1 + ", option2=" + option2 + ", option3=" + option3 + "]";
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
                return true;
        }
        

}