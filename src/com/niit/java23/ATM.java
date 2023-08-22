package com.niit.java23;

public class ATM {
    public float amount =1000000;//1 tr
    public void withdraw(float withforamount) throws OverAmountException {
        if (withforamount>amount){
            //nem ra exception
            throw new OverAmountException();
        }
        amount-=withforamount;
    }

    public static void main(String[] args) {
        ATM atm=new ATM();

        try {
            atm.withdraw(1000000000);
        }catch (OverAmountException e){
            System.out.println("khong du tien roi");
        }
    }
}
