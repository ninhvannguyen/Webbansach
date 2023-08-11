package com.niit.java23.demo_inner_class;

public class RegularOuter {
    private String name ="Regular outer Class";
    public  class RegularInner{
        public void display(){
            System.out.println(name);
        }
    }
}
