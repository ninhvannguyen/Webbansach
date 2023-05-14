package com.niit.java23.abstraction;

public class Villa extends House{
    @Override
    public void printHouse() {
        System.out.println("print Blue");
    }
    public void makeYard(){
        System.out.println("make yard super largest");
    }
}
