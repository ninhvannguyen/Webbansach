package com.niit.java23;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DemoDownloadImage {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://i.pinimg.com/736x/7c/b5/49/7cb5492889809cb8303b76b80759f0df.jpg");
            URLConnection urlConnection =url.openConnection();
            InputStream inputStream = url.openStream();//chuyen doi url thanh stream
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
            FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/AD MID/Desktop/download-image.jpg");
            int i=0;
            while ((i=bufferedInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            bufferedInputStream.close();
            inputStream.close();
        }catch (Exception e){

        }
    }
}
