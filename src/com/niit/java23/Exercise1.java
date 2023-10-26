package com.niit.java23;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class Exercise1 {
    public static void downloadImage(String imageLink){
        //dowload anh
        try {
            URL url=new URL(imageLink);
            InputStream inputStream=url.openStream();
            FileOutputStream fileOutputStream=new FileOutputStream(imageLink);
            byte[] buffer=new byte[1024];
            int length;
            while ((length=inputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer,0,length);
            }
            fileOutputStream.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> listUrlImage =new ArrayList<>();
        //doc duong dan anh

        try {
            FileReader fileReader=new FileReader("/Users/AD MID/Desktop/list_url.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                downloadImage(line);
            }
            fileReader.close();
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
