package com.funwithjava.simple;

public class TelephoneArray {

    public static void main(String[] args) {

        char[][] telephone = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char[] i : telephone) {
            for (char j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }

}
