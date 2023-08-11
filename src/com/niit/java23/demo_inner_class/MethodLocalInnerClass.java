package com.niit.java23.demo_inner_class;

public class MethodLocalInnerClass {
    public  void display(){
        System.out.println("Local Inner");
        class MethodLocalInner{
            public void display(){
                System.out.println("Method Local Inner");
            }
        }
        MethodLocalInner methodLocalInner=new MethodLocalInner();
        methodLocalInner.display();
    }
}
