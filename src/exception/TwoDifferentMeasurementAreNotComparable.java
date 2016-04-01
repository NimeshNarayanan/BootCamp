package exception;

public class TwoDifferentMeasurementAreNotComparable extends Throwable {
    public TwoDifferentMeasurementAreNotComparable() {
        super("two different measurement are not comparable or addable");
    }
}
