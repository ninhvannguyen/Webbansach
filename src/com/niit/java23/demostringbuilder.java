package com.niit.java23;

public class demostringbuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0,5);
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(1,"hello");
        System.out.println(stringBuilder.toString());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
