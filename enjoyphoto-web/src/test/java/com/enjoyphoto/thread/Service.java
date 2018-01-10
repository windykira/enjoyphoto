package com.enjoyphoto.thread;

/**
 * Created by Administrator on 2018/1/2.
 */
public class Service {

    private String lock = "123";

    public void method(){

        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin");
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
