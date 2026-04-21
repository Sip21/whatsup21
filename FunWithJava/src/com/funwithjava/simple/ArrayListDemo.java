package com.funwithjava.simple;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // New arraylist set
        ArrayList<String> names = new ArrayList<>();

        // Enter the number of names you want
        System.out.print("Enter the number of names you want to enter: ");
        int numNames = scanner.nextInt();
        // So to go to next line
        scanner.nextLine();

        // To iterate the names arraylist and add the name of each name.
        for (int i = 1; i <= numNames; i++) {
            System.out.print("Enter the name: " + i + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("The Final Array is " + names);
        scanner.close();
    }

}
