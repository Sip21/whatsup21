package com.funwithjava.simple;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\Supriya\\OneDrive\\Desktop\\test.txt";
        String textContent = "Hi, I am a new file created today!!\n Closed write function";
        // If I don't use try with resources, I have to close the writer object
        // explicitly in the finally block. But with try with resources, it will
        // automatically close the writer object after the try block is executed.
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(textContent);
            System.out.println("File is created..!!");
        } catch (IOException e) {
            System.out.println("File could not be Found..!");
        }

    }

}
