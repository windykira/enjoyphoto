package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/9.
 */
public class MyService {

    public void print(Object object) {

        try {
            synchronized (object) {
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
