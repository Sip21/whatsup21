package com.funwithjava;

import java.util.Iterator;
import java.util.LinkedList;

public class Question2Linkedlist {

    public static void main(String[] args) {
        
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(22);
        l1.add(33);
        l1.add(1);
        l1.add(841);
        
        // Iterator<Integer> it = ll.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }   
        
        // l1.add(0, 40);
        // System.out.println(l1);

        // l1.addFirst(9);
        // l1.addLast(300);
        // System.out.println(l1);

        l1.add(2, 199);
        System.out.println(l1);
         
        for (int i=0; i<l1.size(); i++){
            System.out.println("Element at index "+i+" is "+l1.get(i));
        }

    }

}
