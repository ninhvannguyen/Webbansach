package com.niit.java23.polymorphics;

public class Child extends Parents{
    public void sayMyName(){
        super.sayMyName();
        System.out.println("my name is child class");
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.sayMyName();

    }
}
