package com.niit.java23;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemofileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("C:/Users/AD MID/Desktop/data.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){

        }
    }
}
