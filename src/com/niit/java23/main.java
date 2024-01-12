package com.niit.java23;

public class main {
    public static void main(String[] args) {
/*        MyThread t1=new MyThread("Thread1");//new
        MyThread t2=new MyThread("Thread2");//new

        t1.start();//runable
        t2.start();//runable*//*
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

*//*        try {
            t1.join();
        } catch (Exception e) {

        }*//*
        t2.start();*/
/*        Calculator calculator=new Calculator();
        Thread t1=new Thread(){
            @Override
            public void run() {
                super.run();
                //person.wakeup();
                //person.working();
                calculator.setA(10,20);

            }
        };
        Thread t2 =new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println(calculator.calculator());
            }
        };
        t1.start();
        t2.start();*/
        Person person=new Person();
        Thread t1=new Thread(){
            @Override
            public void run() {
                super.run();
                person.wakeup();
                person.working();
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                super.run();
                person.breakfast();
            }
        };
        t1.start();
        t2.start();
    }

}
