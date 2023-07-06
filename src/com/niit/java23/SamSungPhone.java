package com.niit.java23;

import com.niit.java23.innterface.IMobilePhone;
import com.niit.java23.innterface.MobileOS;

public class SamSungPhone implements IMobilePhone, MobileOS {


    @Override
    public void callPhone(String number) {

    }

    @Override
    public void smsTo(String number, String message) {

    }

    @Override
    public void bootOS() {
        System.out.println("Bott Android OS");

    }

    @Override
    public void instalOS() {
        System.out.println("install Android OS");

    }

    @Override
    public void shutdownOS() {
        System.out.println("Shutdown Android OS");

    }
}
