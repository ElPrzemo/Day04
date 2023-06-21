package car;

public class Aplication {

    public static void main(String[] args) {

        Car car = new Car();

        car.model ="Bmw";
        car.productionYear=1500;
        car.color="Czerwony";
        car.topSpeed=300;

        car.drive();
    }
}
