package com.enjoyphoto.designpattern.decorator;

/**
 * Created by windy on 2018/3/1.
 */
public abstract class Decorator extends SchoolReport{

    private SchoolReport sr;

    public Decorator(SchoolReport sr){

        this.sr = sr;
    }

    public void report(){
        this.sr.report();
    }

    public void sign(String name){
        this.sr.sign(name);
    }
}
