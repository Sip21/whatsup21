package com.funwithjava.simple;

import java.util.Random;
import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numofDice;
        int total = 0;

        while (true) {
            System.out.print("Enter the number of dice rolls: ");
            if (scanner.hasNextInt()) {
                numofDice = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer value.");
                scanner.next(); // Consume the invalid input
            }
        }

        if (numofDice > 0) {
            for (int i = 0; i < numofDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Incorrect value, Cannot be less than 0 ");
        }

        scanner.close();
    }

    static void printDie(int roll) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll..!!");
        }

    }

}
