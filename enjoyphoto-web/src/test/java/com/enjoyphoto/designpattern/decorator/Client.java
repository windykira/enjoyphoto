package com.enjoyphoto.designpattern.decorator;

/**
 * Created by windy on 2018/3/1.
 */
public class Client {

    public static void main(String[] args){

        SchoolReport sr = new FourthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);
        sr.report();
        sr.sign("张三");
    }
}
