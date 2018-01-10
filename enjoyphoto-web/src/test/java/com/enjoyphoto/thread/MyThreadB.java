package com.enjoyphoto.thread;

/**
 * Created by Administrator on 2017/12/27.
 */
public class MyThreadB extends Thread{

    private Service service;

    public MyThreadB(Service service){
        this.service = service;
    }

    public void run(){

        service.method();
    }
}
