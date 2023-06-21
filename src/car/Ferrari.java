package car;

public class Ferrari extends Car{
    boolean isExclusive = true;

    public Ferrari(String model, int productionYear, String color, double topSpeed, boolean isExclusive) {
        super();
        this.isExclusive = isExclusive;
    }

}