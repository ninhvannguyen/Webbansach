package com.niit.java23;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;

public class DemoReadObjectFromFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("C:/Users/AD MID/Desktop/human.dat");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Human human=(Human) objectInputStream.readObject();
            System.out.println(human.getAge());
            System.out.println(human.getName());
        }catch (Exception e){

        }
    }
}
