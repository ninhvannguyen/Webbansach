package com.niit.java23;

import com.niit.java23.bt.Calculator;
import com.niit.java23.bt.Rectangle;
import com.niit.java23.bt.Square;
import com.niit.java23.domain.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Calculator calculator=new Calculator();
        calculator.doCalculator();*/
/*        Square square=new Square();
        System.out.println("vui long nhap vao do dai cua square");
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        square.setEdgewidth(side);
        System.out.println("dien tich hinh vuong la"+square.getArea());*/
        Rectangle rectangle=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao chieu dai");
        float side=sc.nextFloat();
        rectangle.setEdgeOne(side);
        System.out.println("nhap vao chieu rong");
        side=sc.nextFloat();
        rectangle.setEdgeTwo(side);
        System.out.println("dien tich Rectangle la"+rectangle.getArea());
    }
}