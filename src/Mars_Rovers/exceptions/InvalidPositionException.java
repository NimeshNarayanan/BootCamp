package Mars_Rovers.exceptions;

public class InvalidPositionException extends Throwable {
    public InvalidPositionException() {
        super("Given position is invalid");
    }
}
