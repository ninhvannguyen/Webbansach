package com.niit.java23;

import java.util.StringTokenizer;

public class demotokenizer {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer=new StringTokenizer("Hi-there-i-am","-",true);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
