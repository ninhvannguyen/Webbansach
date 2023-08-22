package com.niit.java23;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        do {
            try {
                System.out.println("nhap so thu nhat");
                a =scanner.nextInt();
                break;
            }catch (Exception e) {
                //bat nhap lai
                scanner =new Scanner(System.in);
            }
        }while (true);
        do {
            try {
                System.out.println("nhap so thu hai");
                b =scanner.nextInt();
                break;
            }catch (Exception e) {
                //bat nhap lai
                scanner =new Scanner(System.in);
            }
        }while (true);
        System.out.println("tong 2 so la");
        System.out.println(a+b);
    }
}
