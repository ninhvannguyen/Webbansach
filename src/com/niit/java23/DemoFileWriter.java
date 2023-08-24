package com.niit.java23;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DemoFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("C:/Users/AD MID/Desktop/test.txt",true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            fileWriter.write("\nThis is a new line");
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("i am ninh");
            bufferedWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
        }catch (Exception e){

        }
    }
}
