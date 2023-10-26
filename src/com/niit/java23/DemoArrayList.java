package com.niit.java23;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> listName=new ArrayList<>();
        listName.add("Nguyen van A");
        listName.add(0,"Nguyen Van B");
        listName.remove(0);
        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i));
        }
        for (String name:listName
             ) {
            System.out.println(name);
        }
    }
}
