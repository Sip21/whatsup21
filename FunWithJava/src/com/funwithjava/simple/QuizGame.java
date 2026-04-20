package com.funwithjava.simple;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // Create array opf questions first
        String[] questions = { "How many days are in a week?",
                "Which animal is known as the King of the Jungle?",
                "How many colors are in a rainbow?",
                "Which planet do we live on?",
                "How many months are in a year?"
        };
        // Create array of options
        String[][] options = { { "1. 5", "2. 6", "3. 7", "4. 8" },
                { "1. Tiger", "2. Elephant", "3. Cheetah", "4. Lion" },
                { "1. 7", "2. 5", "3. 6", "4. 9" },
                { "1. Mars", "2. Earth", "3. Mercury", "4. Saturn" },
                { "1. 10", "2. 11", "3. 12", "4. 15" } };

        // Creating the answer array
        int[] answers = { 3, 4, 1, 2, 3 };
        // create variable of score
        int score = 0;
        // create variable of guess
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("***********************************");
        System.out.println("Welcome to the Quiz game " + name + "..!!");
        System.out.println("***********************************");

        // create for loop for questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            // Now create nested loop for the options to display for each question.
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("***********");
                System.out.println("CORRECT..!!");
                System.out.println("***********");
                score++;
            } else {
                System.out.println("***********");
                System.out.println("WRONG..!!");
                System.out.println("***********");
            }

        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();

    }

}
