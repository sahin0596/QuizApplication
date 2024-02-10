package quiz.az.quizapp.errors;

import org.springframework.http.HttpStatus;

public interface ErrorResponse {

    String getKey();
    HttpStatus getHttpStatus();

    String getMessage();
}
