package com.funwithjava.simple;

import java.util.Scanner;

public class ThreadingDemo {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.print("You have 5 seconds to type your name. \n");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Hello " + name + "\n");

        scanner.close();

    }

}
