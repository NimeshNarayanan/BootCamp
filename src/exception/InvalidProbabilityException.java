package exception;

public class InvalidProbabilityException extends Throwable{
    public InvalidProbabilityException() {
        super("Expected probability to be garter then zero and less than one");
    }
}
