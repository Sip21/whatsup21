package com.funwithjava.simple;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {

        // Local date in Java
        LocalDate date = LocalDate.now();
        System.out.println("----------------------------------");
        System.out.println("LocalDate: " + date);

        // Local time in java
        LocalTime time = LocalTime.now();
        System.out.println("----------------------------------");
        System.out.println("LocalTime: " + time);

        // Local Date and Time in java
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("----------------------------------");
        System.out.println("LocalDateTime: " + dateTime);

        // UTC Timestamp in java
        Instant instant = Instant.now();
        System.out.println("----------------------------------");
        System.out.println("In UTC format: " + instant);

        // Custom date Time in java pattern 1
        LocalDateTime dateTime1 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);
        System.out.println("-------------------------------------");
        System.out.println("Custom date and time is : " + newDateTime);

        // Custom Date time pattern 2
        LocalDateTime dateTime2 = LocalDateTime.of(2026, 05, 01, 10, 0);
        LocalDateTime dateTime3 = LocalDateTime.of(2026, 05, 01, 10, 0);
        System.out.println("-------------------------------------");
        System.out.println("Custom date and time2 is : " + dateTime2);
        System.out.println("-------------------------------------");
        System.out.println("Custom date and time3 is : " + dateTime3);

        if (dateTime2.isBefore(dateTime3)) {
            System.out.println("-------------------------------------");
            System.out.println(dateTime2 + " is earlier than the " + dateTime3);
        } else if (dateTime2.isAfter(dateTime3)) {
            System.out.println("-------------------------------------");
            System.out.println(dateTime2 + " is after the " + dateTime3);
        } else if (dateTime2.equals(dateTime3)) {
            System.out.println("-------------------------------------");
            System.out.println(dateTime2 + " is equal to the " + dateTime3);
        }
    }
}
