package com.funwithjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.colorchooser.ColorSelectionModel;

public class Question1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("red");
        al.add("green");
        al.add("blue");
        al.add("yellow");

        System.out.println(al);

        // Iterator it = al.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
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

        // Collections.reverse(al);
        // System.out.println("After reverse....");
        // System.out.println(al);

        // List<String> ss = al.subList(1,3);
        // System.out.println(ss);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("red");
        al2.add("mauve");
        al2.add("pink");
        al2.add("maroon");
        al2.add("blue");
        al2.add("teal");

        // Collections.swap(al2, 2, 4);
        // System.out.println(al2);

        // al.addAll(al2);
        // System.out.println(al);

        // al.removeAll(al);
        // System.out.println(al);

        // al.clone();
        // System.out.println("cloned arraylist: " + al);

        // al.isEmpty();
        // System.out.println(al.isEmpty());

        // al.trimToSize();
        // System.out.println(al);

        // al.ensureCapacity(6);
        // al.add("orange");
        // al.add("purple");
        // System.out.println(al);

        al.size();
        for(int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
       // System.out.println(al.size());

    }

}
