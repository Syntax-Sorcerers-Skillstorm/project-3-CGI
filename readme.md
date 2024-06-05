# Quiz Application

## Objective

Clicking on a quiz routes the user to another page where the user can either start the selected quiz or navigate back to the quiz list page.
Selecting start quiz displays the questions relevant to the quiz (pulled from the database and filtered).
Upon finishing all of the questions, the user can click submit. The application confirms if the user really wants to submit, warning them they will not be able to go back and edit their selections.
Upon submission, the user is navigated to a results page to see the grade for their exam attempt. Grading is done on the backend to avoid making the answers publicly available on the frontend.
From the results page, the user can navigate back to the quiz list page and begin again.
The application considers possible edge cases such as the quiz being submitted with unanswered questions or the user attempting to navigate to quizzes and pages that don’t exist.

## Frontend

#### Quiz List Page:

- Displays all available quizzes.
- Quizzes are logically separated into categories, Angular, JavaScript, Basic Java and HTML/CSS.
- Clicking one of the displayed quizzes redirects the user to the quiz preview page.

#### Quiz Taking Page:

- Prior to quiz starting, displays a brief description of the quiz.
- Upon quiz start, shows all questions.
- Upon submitting the quiz, the quiz is graded and the user is redirected to a page displaying their score.

#### Quiz Score Page:

- Displays the total score of the user.
- Provides a button that returns the user to the home page when clicked.

## Data Management

Stores data in a MySQL database hosted on AWS. 
Provides data to the frontend through a Spring Boot web API.

#### API Endpoints
- GET /questions/{categoryId}/description: Fetches the description of a specific category.
- GET /questions: Retrieves all questions.
- GET /questions/{id}: Retrieves a specific question by ID.
- GET /questions/category/{categoryId}: Retrieves random questions by category.
- POST /answers/submit: Submits answers and returns the quiz result.

## Technologies

#### The application is built using:

- HTML, CSS, JavaScript
- Spring Boot
- Spring Data JPA
- MySQL DB

## Project Structure

```
└── 📁main
    └── 📁java
        └── 📁com
            └── 📁skillstorm
                └── 📁quizapp
                    └── QuizAppApplication.java
                    └── 📁controller
                        └── AnswerController.java
                        └── CategoryController.java
                        └── QuestionController.java
                    └── 📁dto
                        └── AnswerDTO.java
                        └── QuestionDTO.java
                        └── QuizDTO.java
                        └── ResultDTO.java
                    └── 📁models
                        └── Answer.java
                        └── Category.java
                        └── Question.java
                    └── 📁repos
                        └── AnswerRepository.java
                        └── CategoryRepo.java
                        └── QuestionRepo.java
                    └── 📁services
                        └── AnswerService.java
                        └── CategoryService.java
                        └── QuestionService.java
    └── 📁resources
        └── application.properties
        └── properties.yaml
```

### Contributing

Contributions are welcome! Please feel free to submit issues and pull requests.
