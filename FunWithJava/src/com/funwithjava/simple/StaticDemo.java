package com.funwithjava.simple;

public class StaticDemo {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Ram", "boy");
        Friend friend2 = new Friend("Shyam", "boy");
        Friend friend3 = new Friend("Meena", "girl");
        Friend friend4 = new Friend("Neha", "girl");

        System.out.println(friend1.name);
        System.out.println(friend1.gender);
        friend1.tellFriends();
        friend2.tellFriends();
        friend3.tellFriends();
        System.out.println(Friend.numofFriends);

    }

}
