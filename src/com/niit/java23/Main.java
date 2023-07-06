package com.niit.java23;

import com.niit.java23.abstraction.House;
import com.niit.java23.abstraction.TropicalHouse;
import com.niit.java23.abstraction.Villa;
import com.niit.java23.domain.Human;
import com.niit.java23.innterface.IMobilePhone;

public class Main {
    public static void main(String[] args) {
       /* Human human=new Human();
        human.setWeight("70");
        human.setHeight("1.72");
        getHouse(new TropicalHouse());
        House house=new House() {
            @Override
            public void printHouse() {
                System.out.println("print red");
            }
        };

    }
    public static void getHouse(House villa){
        villa.printHouse();*/
        IMobilePhone samSungPhone=new IPhone();
        samSungPhone.callPhone("0952458976");
    }
}