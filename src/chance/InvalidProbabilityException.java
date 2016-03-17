package chance;

public class InvalidProbabilityException extends Exception {
    public InvalidProbabilityException(double chance) {
        super("Probability can't be greater than one or less than zero but got "+chance);
    }
}
