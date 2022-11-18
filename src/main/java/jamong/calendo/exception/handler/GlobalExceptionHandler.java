package jamong.calendo.exception.handler;

import jamong.calendo.exception.ErrorMessage;
import jamong.calendo.exception.collection.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorMessage> handle(BadRequestException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
