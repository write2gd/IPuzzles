package com.gd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dasg
 */
public class ThreadTest {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Thread t1 = new Thread(x);
        Thread t2 = new Thread(y);
        t1.start();           
        t2.start();
    }
    
    
}
class X implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
        System.out.println("XXX");
            try {
                 Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
class Y implements Runnable{

    @Override
    public void run() {
         for(int i=0;i<5;i++){
        System.out.println("YYY");
            try {
                 Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}