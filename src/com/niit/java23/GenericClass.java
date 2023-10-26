package com.niit.java23;

public class GenericClass<T,E> {
    private E e;
    private T t;
    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t=t;
    }
    public <K> void add(K a,K b){
        if(a instanceof Integer && b instanceof Integer){
            System.out.println((Integer)a+(Integer)b);
        } else if (a instanceof Float && b instanceof Float) {
            System.out.println((Float)a+(Float)b);
            
        }
    }
    public void add(Float a,Float b){
        System.out.println(a+b);
    }



    public static void main(String[] args) {
        GenericClass<String,String> genericClass=new GenericClass<>();
        genericClass.setT("hello");
        System.out.println(genericClass.getT());


        GenericClass<Integer,String> genericClass1=new GenericClass<>();
        genericClass1.setT(10);
        System.out.println(genericClass1.getT());

        GenericClass<Float,String> genericClass2=new GenericClass<>();
        genericClass2.setT(10.5f);
        System.out.println(genericClass2.getT());
    }

}
