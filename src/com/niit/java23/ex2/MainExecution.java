package com.niit.java23.ex2;

import java.util.Scanner;

public class MainExecution {
    public static void main(String[] args) {
        int choice=0;
        EmployeeManager employeeManager=new EmployeeManager();
        do {

            Scanner sc=new Scanner(System.in);
            System.out.println("vui long chon");
            System.out.println("1.them NV");
            System.out.println("2.danh sach NV");
            System.out.println("3. thoat");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    employeeManager.addEmployee();
                    break;
                case 2:
                    employeeManager.listEmployee();
                    break;
            }
        }while (choice !=3);


    }
}
