package practice.java.application;

import practice.java.data.Avanza;
import practice.java.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();

        car.drive();
        System.out.println(car.getTire());
    }
}
