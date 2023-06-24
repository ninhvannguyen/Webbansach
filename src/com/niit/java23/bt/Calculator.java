package com.niit.java23.bt;

import java.util.Scanner;

public class Calculator {
    private int a,b;

    public float add(int a, int b){
        return a+b;
    }
    public float sub(int a,int b){
        return a-b;
    }
    public float multiple(int a,int b){
        return a*b;
    }
    public float devine(int a,int b){
        return a/b;
    }
    public void doCalculator(){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so thu nhat");
        a=sc.nextInt();
        System.out.println("nhap so thu hai");
        b=sc.nextInt();
        System.out.println("vui long nhap toan tu");
        sc=new Scanner(System.in);
        String operator=sc.nextLine();
        float result = 0;
        switch (operator){
            case "+":
                result= add(a,b);
                break;
            case "-":
                result= sub(a,b);
                break;
            case "*":
                result= multiple(a,b);
                break;
            case"/":
                result= devine(a,b);
                break;
        }
        System.out.println("ket qua cua phep tinh la" +result);
    }

}
