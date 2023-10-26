package com.niit.java23;

import java.util.ArrayList;

public class DemoWildcard {
    public void listColection(ArrayList<? super Short> list){
        for (Object o:list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        DemoWildcard demoWildcard=new DemoWildcard();
        ArrayList<Object> list=new ArrayList<Object>();
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        demoWildcard.listColection(list);
    }
}
