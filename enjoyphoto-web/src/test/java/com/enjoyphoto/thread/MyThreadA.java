package com.enjoyphoto.thread;

/**
 * Created by windy on 2017/12/27.
 */
public class MyThreadA extends Thread{

    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }


    public void run(){


    }

}
