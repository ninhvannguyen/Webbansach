package com.niit.java23;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DemofileInputstream {
    public static void main(String[] args) {
        try {
            //B1:Tao doi tuong FileInputStream de doc du lieu tu file
            FileInputStream fileInputStream=new FileInputStream("C:/Users/AD MID/Desktop/data.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            //B2:Doc file
            int i=0;
            //duyet file de doc
/*            while((i=fileInputStream.read()) !=-1){
                System.out.print((char) i);
            }
            fileInputStream.close();*/
            while((i=bufferedInputStream.read()) !=-1){
                System.out.print((char) i);
            }
            fileInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
