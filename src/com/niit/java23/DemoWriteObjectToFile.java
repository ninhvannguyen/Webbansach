package com.niit.java23;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoWriteObjectToFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/AD MID/Desktop/human.dat");
            Human ninh=new Human();
            ninh.setAge(20);
            ninh.setName("Ninh");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ninh);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){

        }
    }
}
