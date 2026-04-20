package com.funwithjava.simple;

public class Array2D {

    public static void main(String[] args) {

        String[][] school = { { "Ram", "Shyam", "Meena" },
                { "Physics", "Chemistry", "Maths", "Biology" },
                { "Class A", "Class B", "Class C" } };

        for (String[] i : school) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
