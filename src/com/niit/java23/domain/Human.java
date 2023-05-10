package com.niit.java23.domain;

public class Human {
    public static  String className;
    public String eyeColor;
    public String height;
    public String weight;
    public String name;
    public int yearOfbirth;
    public Human(){

    }
    public Human(String eyeColor ,String height,String weight,String name){
        this.eyeColor=eyeColor;
        this.height=height;
        this.weight=weight;
        this.name=name;
    }
    public Human(String eyeColor){

    }
    public void walk(){
        System.out.println(name+" is walking");
    }
    public void eat(){
        System.out.println(name+"human is eating");
    }
    public void  learn(){
        System.out.println(name +"is learning");
    }
    public int getAge(){
        return 2021-yearOfbirth;
    }
    public  static void princlassName(){
        System.out.println(Human.className);
    }
}
