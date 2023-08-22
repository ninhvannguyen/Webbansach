package com.niit.java23;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        String account,pin;
        Account authAccount = null;
        Account[] accounts=new Account[3];
        accounts[0]=new Account("0","Nguyen Van A","123456",10000.f);
        accounts[2]=new Account("2","Nguyen Van C","45678",20000.f);
        accounts[1]=new Account("1","Nguyen Van B","23456",10000.f);


        Scanner scanner=new Scanner(System.in);
        System.out.println("Vui long nhap so tai khoan va ma pin");
        System.out.println("So tai khoan:");
        account=scanner.nextLine();
        System.out.println("Ma pin:");
        scanner=new Scanner(System.in);
        pin=scanner.nextLine();
        for (Account accountItem:accounts
             ) {
            if (accountItem.getAccountNumber().equals(account)&&accountItem.getPin().equals(pin)){
                authAccount=accountItem;
                break;
            }
        }
        if (authAccount!=null){
            //xử lý
        }else{
            System.out.println("Tai khoan hoac ma pin khong dung");
        }
    }

}
