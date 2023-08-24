package com.niit.java23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoFileOutputStream {
    public static void main(String[] args) {
        try {
            //B1:Tao doi tuong FileInputStream de doc du lieu tu file
            FileInputStream fileInputStream=new FileInputStream("C:/Users/AD MID/Downloads/hinhcmnd.jpg");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/AD MID/Desktop/data-4.jpg");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            //B2:Doc file
            int i=0;
            //duyet file de doc
/*            while((i=fileInputStream.read()) !=-1){
                System.out.print((char) i);
            }
            fileInputStream.close();*/
            while((i=bufferedInputStream.read()) !=-1){
                //System.out.print((char) i);
                //fileOutputStream.write(i);
                bufferedOutputStream.write(i);
            }
            bufferedOutputStream.flush();//dam bao du lieu da sync tu buffer(cache) vao o cung



            //fileOutputStream.write("Hello world".getBytes());
            fileOutputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
