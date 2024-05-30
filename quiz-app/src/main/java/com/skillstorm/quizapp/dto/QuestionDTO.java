package com.skillstorm.quizapp.dto;

public class QuestionDTO {
        private Integer questionId;
        private String questionText;
        private String option1;
        private String option2;
        private String option3;

        public QuestionDTO() {
        }

        public QuestionDTO(Integer questionId, String questionText, String option1, String option2, String option3) {
                this.questionId = questionId;
                this.questionText = questionText;
                this.option1 = option1;
                this.option2 = option2;
                this.option3 = option3;
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