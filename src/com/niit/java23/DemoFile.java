package com.niit.java23;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File file=new File("C:/Users/AD MID/Documents");
        File newDir=new File(file,"newDir");
        newDir.mkdirs();
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }
}
