package com.niit.java23;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
/*        try {
            FileInputStream file=new FileInputStream("/Users/AD MID/Desktop/data1.txt");
        }catch (IOException e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("khong tim thay file he thong");
        }
        System.out.println("hello");*/
        int[] numbers =new int[]{1,2,3,4};
        try {
            System.out.println(10/0);
//            System.out.println(numbers[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ban da truy cap qua gioi han phan tu trong mang");
        }catch (Exception e) {
            System.out.println("loi gi do ko xac dinh");
        }finally {
            System.out.println("chay vao day");
        }

        System.out.println("hello");

    }
}
