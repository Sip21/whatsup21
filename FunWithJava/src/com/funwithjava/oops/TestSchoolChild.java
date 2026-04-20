package com.funwithjava.oops;

public class TestSchoolChild extends SchoolParentClass {

    public String schoolName(){
        return "DPS";
    }

    public String schoolLocation(){
        return "Bhilai";
    }

    @Override
    public String principal(){
        return "Supriya";
    }

}
