package com.funwithjava.simple;

import java.util.Scanner;

public class whiledemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String name = "";

        // while (name.isEmpty()) {
        // System.out.print("Enter the name: ");
        // name = scanner.nextLine();

        // }

        // System.out.print("Hello " + name.toUpperCase() + "\n");
        // System.out.print("Hello " + name.compareTo("Supriya"));

        // System.out.print("Enter a letter: ");
        // String response = scanner.nextLine();

        // while (!response.equals("Q")) {
        // System.out.print("You are playing the game!!" + "\n");
        // System.out.print("Press Q to quit: ");
        // response = scanner.next().toUpperCase();
        // }

        // System.out.print("You have quit the game!!");

        // int age = 0;
        // System.out.print("Enter your age: ");
        // age = scanner.nextInt();

        // while (age < 0) {
        // System.out.print("Enter valid age! Negative age is invalid" + "\n");
        // System.out.print("Enter your age again: ");
        // age = scanner.nextInt();
        // }

        // System.out.print("You age is " + age);

        int age = 0;

        do {
            // System.out.print("Enter valid age! Negative age is invalid !!" + "\n");
            System.out.print("Enter your age again: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.print("You age is " + age);

        scanner.close();
    }

}