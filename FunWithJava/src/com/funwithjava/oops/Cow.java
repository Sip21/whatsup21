package com.funwithjava.oops;

public class Cow extends Animal{

    @Override
    protected String getLegs() {
        return "4";
    }

    @Override
    protected String getAnimalType() {
        return "big";
    }

    @Override
    protected String getColor() {
        return "brown";
    }

    @Override
    protected String getSize() {
        return "small";
    }

    protected String getShelter(){
        return "Vrindavan";
    }

}
