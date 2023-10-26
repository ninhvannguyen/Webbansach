package com.niit.java23;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Name");
        hs.add("Ninh");
        hs.add("Ninh");
        for (String s:hs
             ) {
            System.out.println(s);

        }
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Name");
        ts.add("Ninh");
        for (String g:ts
        ) {
            System.out.println(g);

        }
    }
}
