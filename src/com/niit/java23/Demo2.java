package com.niit.java23;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("/Users/AD MID/Desktop/data1.txt");
            file.close();
        } catch (IOException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("khong tim thay file he thong");
        }
        try (FileInputStream file=new FileInputStream("/Users/AD MID/Desktop/data1.txt")){
            //xu ly gi do

        }catch (IOException e) {

        }
    }



}
