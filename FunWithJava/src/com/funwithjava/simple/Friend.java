package com.funwithjava.simple;

public class Friend {

    static int numofFriends;
    String name;
    String gender;

    Friend(String name, String gender) {
        this.name = name;
        this.gender = gender;
        numofFriends++;
    }

    void tellFriends() {
        System.out.println("Hi I am " + name + " and I am a " + gender + " .");
    }

}
