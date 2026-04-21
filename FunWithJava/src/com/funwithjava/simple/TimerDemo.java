package com.funwithjava.simple;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

    public static void main(String[] args) {

        // Create timer object
        Timer timer = new Timer();
        // Create timertask object
        TimerTask task = new TimerTask() {
            int count = 5;

            // Anonymous class created here and overriden the run method
            @Override
            public void run() {
                System.out.println("Hello welcome..!!");
                count--;
                if (count <= 0) {
                    System.out.println("---------------------");
                    System.out.println("Task is completed..!!");
                    System.out.println("---------------------");
                    // canceling the timer class, otherwise it keeps on running
                    timer.cancel();
                }
            }
        };
        // schedule method is used for running the Timer class and its inputs are Task ,
        // firstdelay and then repetition delay time in ms.
        timer.schedule(task, 5000, 1000);

    }

}
