package com.enjoyphoto.thread;

/**
 * Created by windy on 2018/1/9.
 */
public class MyThreadB extends Thread{

    private MyService myService;

    public MyThreadB(MyService myService) {
        this.myService = myService;
    }

    private Service service;

    public MyThreadB(Service service){
        this.service = service;
    }

    public void run(){

        myService.print(new Object());
    }
}
