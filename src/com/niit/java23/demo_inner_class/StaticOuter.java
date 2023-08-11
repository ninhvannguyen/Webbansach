package com.niit.java23.demo_inner_class;

public class StaticOuter {
    private  String name="Regular outer Class";
    private static int age=20;
    public static class StaticIner{
        public void display(){
            System.out.println(age);
        }
    }
}
