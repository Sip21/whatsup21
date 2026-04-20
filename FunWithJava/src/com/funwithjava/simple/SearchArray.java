package com.funwithjava.simple;

import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] fruits = { "apples", "mangoes", "pineapples", "oranges" };
        boolean isFound = false;
        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }

        }

        if (!isFound) {
            System.out.print("Element not present in the Array.");
        }

        scanner.close();
    }
}
