package quiz.az.quizapp.errors;
import org.springframework.http.HttpStatus;

public enum Errors implements ErrorResponse {

    jakarta_NOT_NULL("jakart.validation.constrains.NotNull.message",HttpStatus.BAD_REQUEST,"NOT NULL"),
    QUESTION_NOT_FOUND("QUESTION_NOT_FOUND",HttpStatus.NOT_FOUND,"NOT FOUND");

    HttpStatus httpStatus;
    String key;

    String message;

    Errors(String key,HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.key= key;
        this.message = message;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

