package chance;

public class Chance {
    private Double chance;

    private Chance(Double chance) {
        this.chance = chance;
    }

    public static Chance create(double chance)throws InvalidProbabilityException{
        if (chance<0 || chance >1)
            throw new InvalidProbabilityException(chance);
        else
            return new Chance(chance);
    }
    public Chance negate() throws InvalidProbabilityException {
        return create(1-this.chance);
    }
    public Chance or(Chance chance)throws InvalidProbabilityException{
        return create(chance.chance + this.chance);
    }
    public Chance and(Chance chance) throws InvalidProbabilityException {
        return create(this.chance * chance.chance);
    }

//    public Percentage covertToPercentage(){
//        return Percentage.create(chance, (double) 1);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance1 = (Chance) o;

        return chance != null ? chance.equals(chance1.chance) : chance1.chance == null;
    }

    @Override
    public int hashCode() {
        return chance != null ? chance.hashCode() : 0;
    }

    @Override
    public String toString() {
        return chance.toString();
    }
}
