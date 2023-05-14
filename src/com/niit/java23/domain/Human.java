package com.niit.java23.domain;

public class Human {
    public static  String className;
    private String eyeColor;
    private String height;
    private String weight;
    private String name;
    private int yearOfbirth;
    private String job;
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

    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        Human.className = className;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfbirth() {
        return yearOfbirth;
    }

    public void setYearOfbirth(int yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
