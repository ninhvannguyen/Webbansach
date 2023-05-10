package com.niit.java23;

public class BT {
    public static void main(String[] args) {
        String name="Ninh";
        String placeHolder="X";
        placeHolder=placeHolder.replaceAll("X","XXXXXXXXXX");
        placeHolder=placeHolder.replaceAll("X","XXXXXXXXXX");//100 ky tu x
        placeHolder=placeHolder.replaceAll("X","XXXXXXXXXX");//1000 ky tu x
        placeHolder=placeHolder.replaceAll("X",name+"\n");
        System.out.println(placeHolder);

    }
}
