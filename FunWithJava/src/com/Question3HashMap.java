package com;

import java.util.HashMap;
import java.util.Set;

public class Question3HashMap {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 88);
        map.put(2, 53);
        map.put(3, 61);
        System.out.println("Original Map: " + map);

        // map.size();
        // System.out.println(map.size());

        // HashMap<Integer,Integer> map2 = new HashMap<>();
        // map2.put(4, 22);
        // map2.put(5, 43);
        // map2.put(6, 72);

        // map.putAll(map2);
        // System.out.println(map);

        // map.clear();
        // boolean result = map.isEmpty();

        // HashMap<Integer, Integer> c1 = (HashMap<Integer, Integer>) map.clone();
        // System.out.println("Cloned map:: " + c1);

        // Set set = map.entrySet();
        // System.out.println(set);

        // Set set1 = map.keySet();
        // System.out.println(set1);

        System.out.println(map.values());

    }
}
