package com.niit.java23.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    ArrayList<Employee> employees=new ArrayList<>();
    public static final  String DB_FILE="/Users/AD MID/Desktop/Employee.dat";
    public EmployeeManager(){
        File file=new File("/Users/AD MID/Desktop/Employee.dat");
        if(file.exists()){
            try {
                FileInputStream fileInputStream=new FileInputStream(DB_FILE);
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
                employees=(ArrayList<Employee>) objectInputStream.readObject();
            }catch (Exception e){

            }
        }
    }
    public void listEmployee(){
        for (Employee employee:employees
             ) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }

    }
    public void addEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Vui long nhap id");
        int id=sc.nextInt();
        System.out.println("Vui long nhap ten");
        String name=sc.next();
        System.out.println("Vui long nhap tuoi");
        int age=sc.nextInt();
        System.out.println("Vui long nhap luong");
        int salary=sc.nextInt();
        Employee employee=new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);
        employees.add(employee);
        asyncData();
    }
    public void asyncData(){
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("/Users/AD MID/Desktop/Employee.dat");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);
            objectOutputStream.close();
        }catch (Exception e){

        }
    }
    public void displayHighestEmployeeSalary(){

    }
    public void displayLowestEmployeeSalary(){

    }

}
