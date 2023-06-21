package Homework;

public class Car {
    private int year = 2015;
    private String mark = "Honda";
    private double speed = 85;

    public int getYear() {
        return year;
    }

    public String getMark() {
        return mark;
    }

    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Marka samochodu to: " + car.getMark()
                + " został wyprodukowany w " + car.getYear()
                + " osiąga maksymalną prędkość " + car.getSpeed() + " kilometrów na godzine.");
    }
}
