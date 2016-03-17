package chance;

public class Percentage {
    private Double chance,i;

    public Percentage(Double chance, Double i) {
        this.chance = chance;
        this.i = i;
    }

    public static Percentage create(Double chance, Double i) {
        return new Percentage(chance, i);
    }

    @Override
    public String toString() {
        return (chance*100/i)+"%";
    }
}
