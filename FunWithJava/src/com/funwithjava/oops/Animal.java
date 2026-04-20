package com.funwithjava.oops;

public abstract class Animal {

    protected abstract String getLegs(); //Abstract method 1
    protected abstract String getAnimalType(); //Abstract method 1
    protected abstract String getColor();
    protected abstract String getSize();

    protected String getEyes(){
        return "2";
    }
}

