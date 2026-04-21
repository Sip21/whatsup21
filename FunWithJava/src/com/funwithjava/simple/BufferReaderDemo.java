package com.funwithjava.simple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {

        String filePath = "test.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.println("-------------------------------");
            System.out.println("File Found on the given path..!!");
            System.out.println("-------------------------------");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found..!!");
        } catch (IOException e) {
            System.out.println("IO error occurred..!!");
        }
    }

}
