package com.funwithjava.simple;

public class Car {

    private String name;
    String color;
    int year;
    String model;

    // create constructor
    Car(String name, String color, int year, String model) {
        this.name = name; // RHS one is above one coming from constructor, this can be as Car(String a)
                          // and
                          // then this.name = a;)
        this.color = color;
        this.year = year;
        this.model = model;
    }

    void drive() {
        System.out.println(" I am driving " + color + " " + name + " year " + year + " and of company " + model);
    }

    @Override
    public String toString() {
        return ("name of car: " + name + " color: " + color);
    }

    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
