package com.niit.java23;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
/*        MyThread t1=new MyThread("Thread1");//new
        MyThread t2=new MyThread("Thread2");//new

        t1.start();//runable
        t2.start();//runable*/
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1  is running");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2  is running");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }
            }
        });
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();

/*        try {
            t1.join();
        } catch (Exception e) {

        }*/
        t2.start();

    }

}
