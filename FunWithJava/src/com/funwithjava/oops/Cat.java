package com.funwithjava.oops;

public class Cat extends Animal{

    @Override
    protected String getLegs() {
        return "4";
    }

    @Override
    protected String getAnimalType() {
        return "small";
    }

    @Override
    protected String getColor() {
        return "white";
    }

    @Override
    protected String getSize() {
        return "small";
    }

    protected String getFoodHabit(){
        return "Rat";
    }

    

}
