package com.funwithjava.simple;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of Rows: \n");
        rows = scanner.nextInt();

        System.out.print("Enter the number of Columns: \n");
        columns = scanner.nextInt();

        System.out.print("Enter the character/symbol: \n");
        symbol = scanner.next().charAt(0);
        System.out.println("Here is the output....");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) { // This is for column iteration
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

}
