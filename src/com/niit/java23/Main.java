package com.niit.java23;

import com.niit.java23.domain.Human;

public class Main {
    public static void main(String[] args) {
        Human luan=new Human();
        luan.walk();
        luan.eat();
        luan.learn();
        Human nam=new Human();
        nam.walk();
        nam.eat();
        nam.learn();
        Human.className="Human";
        Human.princlassName();
    }
}