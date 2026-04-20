package com.funwithjava.simple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Rabbit rabbit = new Rabbit();
        // Hawk hawk = new Hawk();
        // Fish fish = new Fish();

        // rabbit.flee();
        // hawk.hunt();
        // fish.flee();
        // fish.hunt();

        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you choice 1. Dog   2. Cat :: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();

        } else {
            animal = new Cat();
            animal.speak();
        }

        scanner.close();

    }

}
