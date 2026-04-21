package com.funwithjava.simple;

public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car("Nexon", "White", 1991, "TATA");
        Car car2 = new Car("Crysta", "Black", 1999, "MARUTI");
        Car car3 = new Car("Thar", "Red", 2009, "MAHINDRA");

        Car[] cars = { car1, car2, car3 };

        // for (Car car : cars) {
        // car.color = "Yellow";
        // }

        for (Car car : cars) {
            car.drive();
        }

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Private variable: " + car1.getName());
        car1.setColor("Blue");
        System.out.println("Private variable: " + car1.getColor());
    }

}
