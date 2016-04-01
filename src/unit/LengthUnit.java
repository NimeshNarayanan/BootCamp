package unit;

public enum LengthUnit implements Unit {
    INCH(1),
    CENTIMETER(.4),
    FEET(12),
    MILLIMETER(.04);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    @Override
    public double getConversionFactor() {
        return this.conversionFactor;
    }
}
