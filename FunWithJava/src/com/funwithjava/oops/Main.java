package com.funwithjava.oops;

public class Main {

    public static void main(String args[]){
        Cow cow = new Cow();
        System.out.println(cow.getAnimalType()); 
        System.out.println(cow.getEyes());

        Cat cat = new Cat();
        System.out.println(cat.getAnimalType());


        TestSchoolChild test = new TestSchoolChild();
        // SchoolParentClass sch = new SchoolParentClass();
        System.out.println("School Location: " + test.schoolLocation());
        System.out.println("School Name: " + test.schoolName());
        System.out.println("School Teachers : " + test.teacher());
        System.out.println("School Principal : " +test.principal());


        Derived2 der2 = new Derived2();
        System.out.println("Value 1: " + der2.stand());
        System.out.println("Value 2: " + der2.walk());
        System.out.println("Value 3: " + der2.run());
    }
    
}
