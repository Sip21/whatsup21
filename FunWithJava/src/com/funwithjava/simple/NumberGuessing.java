package com.funwithjava.simple;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        // Number guessing game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(min, max + 1); // defining the random number range
        System.out.println("Welcome to Number Guessing Game");
        System.out.printf("Enter any number between %d- %d\n", min, max);

        do {
            System.out.print("Enter the Number of your choice : ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("TOO LOW");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH");
            } else {
                System.out.println("CORRECT");
            }

        } while (guess != randomNumber); // checking condition for guess is not equal to random number till then the,//
                                         // while condition will be checked.

        System.out.println("The correct number was " + guess);
        System.out.print("The number of attempts were " + attempts);
        scanner.close();

    }
}
