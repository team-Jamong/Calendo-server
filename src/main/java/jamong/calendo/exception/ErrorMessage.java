package jamong.calendo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ErrorMessage {
    private String message;
    private HttpStatus status;
}
