package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/9.
 */
public class MyThreadB extends Thread{

    private MyService myService;

    public MyThreadB(MyService myService){
        this.myService = myService;
    }

    public void run(){

        myService.print(new Object());
    }
}
