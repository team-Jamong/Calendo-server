package jamong.calendo.exception.collection;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);
    }
}
