package com.niit.java23;

public class demostring {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);// so sanh ve dia chi cua chuoi
        System.out.println(s1.equals(s2));//so sanh gia tri cua chuoi
        String s3=new String("hi");
        String s4=new String("hi");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.length());
        System.out.println(s3.charAt(0));
        String s5 =new String("Hello motor");
        char[] dest=new char[6];
        s5.getChars(0,5,dest,0);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);

        }
        String s6=new String("helllo world");
        System.out.println(s6.compareTo("hello sdhjhafefh"));

    }
}
