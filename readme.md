# Quiz Application
### Project Instructions
### Due 06/07/24

## Objective:
Create a quiz application that displays a list of available quizzes offered on the site, broken down by quiz subject. On the page where the quizzes are listed, information such as the quiz name, subject, and number of questions should be displayed.

- Clicking on a quiz will route the user to another page where the user can either start the quiz selected or navigate back to the quiz list page.
- Selecting start quiz will display the questions relevant to the quiz (pulled from the database and filtered).
- Upon finishing all of the questions, the user should be able to click submit. Make sure to confirm if the user really wants to submit warning them they will not be able to go back and edit their selections.
- Upon submission, the user should be navigated to a results page to see the grade for their exam attempt. Grading must be done on the backend to avoid making the answers publicly available on the frontend.
- From the results page, the user should be able to navigate back to the quiz list page and begin again.
- The application should also take into consideration possible edge cases such as the quiz being submitted with unanswered questions or the user attempting to navigate to quizzes and pages that don’t exist.

## Functional Requirements:
### Frontend:

- Quiz List Page:
    -  All available quizzes should be displayed
    -  Quizzes will be logically separated into subdivisions based on quiz category (ie. Math, Science, History, etc.)
    -  Basic quiz information should be displayed here (ie. Number of questions, quiz name, etc.)
    -  Clicking one of the displayed quizzes will redirect user to the quiz preview page
- Quiz Taking Page
    -  Prior to quiz starting, display a brief description of the quiz, number of questions, and an option to either start the quiz or return to the quiz list page
    -  Upon quiz start, show all questions and they’re answers
    -  Upon submitting the quiz, the quiz is graded and the user is redirected to a page displaying their score
- Quiz Score Page
    - The total score of the user is displayed on the screen
    - The user has the ability to view the questions answered and see the questions they got wrong
    -  Have a button returns them to the home page when clicked

### Backend:

- Data must be stored in a MySQL database
- Database schema design must logically separate entities such as quiz data and question data
- Data must be made available to the frontend through a web API
- Web API must be built with Spring Boot

## Non-Functional Requirements:
- Well documented code
- Code is displayed on GitHub for project presentation
- Code upholds industry best practices (SOLID/DRY)

## UI/UX Requirements
- Website should look and feel professional.
- Navigation should be easy and intuitive.
- Errors (and success) should be clearly communicated to the user.

## Bonus Challenges:
- Deploy your application to AWS 
- Setup a CI/CD pipeline
- Add a timer for quizzes
- Add a section for the user to select related quizzes upon finishing
- Have quizzes with multiple question types (ie. multiple choice, select multiple, etc.)
- Add users login to save a record of their results.
    -  Add a Quiz History page.
    -  Indicate on the main page which quizzes they have already taken.

## Technologies
You will make the project using these technologies

- HTML, CSS, JavaScript or Angular
- CSS or a CSS Framework (PrimeNG, Angular Material, not Bootstrap)
- Spring Boot
- Spring Data JPA
- Spring Security Basic Authentication
- MySQL