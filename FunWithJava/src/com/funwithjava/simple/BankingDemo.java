package com.funwithjava.simple;

import java.util.Scanner;

public class BankingDemo {

    static Scanner scanner = new Scanner(System.in);

    // Java Banking Program
    public static void main(String[] args) {

        // Declare variable
        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("***************");
            System.out.println("Welcome to Banking System!!");
            System.out.println("***************");

            // Banking options provide
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice from above 1-4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("***************");
        System.out.print("Thank you and have a niceday..!!");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$ %.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.print("Insufficient Balance!!!\n");
            return 0;
        } else if (amount < 0) {
            System.out.print("Amount cant be negative..");
            return 0;
        } else {
            return amount;
        }
    }
}
