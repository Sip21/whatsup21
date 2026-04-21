package com.funwithjava.simple;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // for loop needed for counter to run.
        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            // If Condition is needed to print the message only when the condition matches,
            // otheriwse this will print each time.
            if (i == 5) {
                System.out.println("Times up..!");
                System.exit(0);
            }

        }

    }

}
