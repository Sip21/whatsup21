package com.funwithjava.simple;

import java.util.Scanner;

public class calculator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter the first Number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the type of operand (+ , - , *, /, ^) : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second Number: ");
        number2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.print("Cannot divide by 0");
                    validOperator = false;
                } else {
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.print("Invalid Operator");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.print(result);
        }

        scanner.close();
    }
}
