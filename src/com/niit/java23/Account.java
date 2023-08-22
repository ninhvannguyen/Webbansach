package com.niit.java23;

public class Account {
    String accountNumber;
    String FullName;
    String Pin;
    Float balance;


    public Account(String accountNumber, String fullName, String pin, Float balance) {
        this.accountNumber = accountNumber;
        FullName = fullName;
        Pin = pin;
        this.balance = balance;
    }




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }


}
