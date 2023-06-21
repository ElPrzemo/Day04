package car;

public class Car {
    //NIE MA static
    public String model;

    public int productionYear;

    public String color;

    public double topSpeed;

    public Car() {
    }

    public void drive(){
        System.out.println("Samochód: "+ model);
        System.out.println("z roku: " + productionYear);
        System.out.println("o kolorze: " + color);
        System.out.println("zaczyna jechać");
    }
}