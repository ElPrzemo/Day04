package Homework;

import java.util.Scanner;

public class Rectangle {


    private double length;
    private double width;


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Podaj długość prostokąta: ");
        rectangle.setLength(scanner.nextDouble());

        System.out.println("Podaj wysokość prostokąta: ");
        rectangle.setWidth(scanner.nextDouble());


        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();


        System.out.println("Pole prostokąta to: " + area);
        System.out.println("Obwód prostokąta to: " + perimeter);
    }
}
