package com.funwithjava.simple;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        // catch (Exception e) {
        // System.out.println("Exception Found..!!");
        // }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Found..!!");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception Found..!!");
        } finally {
            System.out.println("Finaly its here..!!");
        }

    }
}
