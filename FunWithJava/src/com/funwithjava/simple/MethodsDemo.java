package com.funwithjava.simple;

import java.util.Scanner;

public class MethodsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the name: ");
        // String name = scanner.nextLine();
        // System.out.print("Enter the age: ");
        // int age = scanner.nextInt();
        // happyBirthday(name, age);

        // System.out.println("Enter the Number: ");
        // double number = scanner.nextDouble();
        // double result = square(number);
        // System.out.print("Result is :" + result);

        System.out.print("Enter the Age: ");
        int age = scanner.nextInt();
        if (checkAge(age)) {
            System.out.print("Please continue to Sign up..!!");
        } else {
            System.out.print("You are not 18 or 18+ years old now..!!");
        }

        scanner.close();
    }

    // Method to say Happybirthday based on Name and Age
    static void happyBirthday(String name, int age) {
        System.out.printf("Happy Birthday to %s ..!! \n", name);
        System.out.printf("You are %d years old..!!", age);
    }

    // Method to return square of number
    static double square(double number) {
        return number * number;
    }

    // Method to check age of a person
    static boolean checkAge(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
