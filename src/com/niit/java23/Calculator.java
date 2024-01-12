package com.niit.java23;

public class Calculator {
    private  int a=1,b=2;
/*    public  void wakeup(){
        System.out.println("I am wake up");
    }
    public void working(){
        System.out.println("i am working");

        ///System.out.println("i am continue working");
    }
    public void breakfast(){
        System.out.println("iam get braekfast");

    }*/
    public synchronized void setA(int a,int b){
        try {
            Thread.sleep(4000);
        }catch (Exception e){

        }
        this.a=a;
        this.b=b;
    }


    public synchronized int calculator(){
        return a + b;
    }

}
