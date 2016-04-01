package unit;

import exception.TwoDifferentMeasurementAreNotComparable;

public class Measurable {
    private final double value;
    private final Unit unit;

    public Measurable(double value , Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Measurable other) throws TwoDifferentMeasurementAreNotComparable {
        if(this.unit.getClass() != other.unit.getClass())
            throw  new TwoDifferentMeasurementAreNotComparable();
        return (value * unit.getConversionFactor()) == (other.value * other.unit.getConversionFactor());
    }
    private double roundToTwoDecimalPlace(double value){
        return (Math.round(value*100.0)/100.0);
    }

    public Measurable add(Measurable other) throws TwoDifferentMeasurementAreNotComparable {
        if(this.unit.getClass() != other.unit.getClass())
            throw  new TwoDifferentMeasurementAreNotComparable();
        double additionResult = (value*unit.getConversionFactor()) + (other.value * other.unit.getConversionFactor());
        double convertInCurrentUnit = additionResult/unit.getConversionFactor();
        double roundOfResult = roundToTwoDecimalPlace(convertInCurrentUnit);
        return new Measurable(roundOfResult,unit);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurable length = (Measurable) o;

        return Double.compare(length.value, value) == 0 && unit == length.unit;

    }
}
