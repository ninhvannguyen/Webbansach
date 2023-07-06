package com.niit.java23;

import com.niit.java23.innterface.IMobilePhone;
import com.niit.java23.innterface.MobileOS;

public class IPhone implements IMobilePhone, MobileOS {
    @Override
    public void callPhone(String number) {

    }

    @Override
    public void smsTo(String number, String message) {

    }

    @Override
    public void bootOS() {
        System.out.println("Bott Iphone OS");

    }

    @Override
    public void instalOS() {
        System.out.println("install Iphone OS");

    }

    @Override
    public void shutdownOS() {
        System.out.println("Shutdown Iphone OS");
    }
}
