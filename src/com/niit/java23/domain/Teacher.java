package com.niit.java23.domain;

public class Teacher extends Human{

    public void teacherCoputer(){
        Computer computer=new Computer();
        String coputerName=computer.computerName;
    }

    @Override
    public String getEyeColor() {
        return super.getEyeColor();
    }
}
