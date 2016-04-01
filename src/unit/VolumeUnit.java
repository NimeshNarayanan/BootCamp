package unit;


public enum  VolumeUnit implements Unit {
    GALLON(3.78),
    LITER(1);
    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    @Override
    public double getConversionFactor() {
        return this.conversionFactor;
    }
}
