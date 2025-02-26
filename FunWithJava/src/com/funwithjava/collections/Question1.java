package com.funwithjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("red");
        al.add("green");
        al.add("blue");
        al.add("yellow");

         System.out.println(al);

        // Iterator it = al.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // al.add(0, "yellow");
        // System.out.println(al);

        // al.set(1, "black");
        // System.out.println(al);

       // System.out.println(al.contains("red"));

        // al.sort(null);
        // System.out.println(al);

        // ArrayList al2 = new ArrayList();
        // al2.add(5);
        // al2.add(110);
        // al2.add(15);
        // al2.add(20);
        // System.out.println(al2);

        // al.addAll(al2);
        // System.out.println(al);

        // Collections.shuffle(al);
        // System.out.println("After shuffle....");
        // System.out.println(al);

        Collections.reverse(al);
        System.out.println("After reverse....");
        System.out.println(al);
    }

}
