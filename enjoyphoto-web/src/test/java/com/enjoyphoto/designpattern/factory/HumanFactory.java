package com.enjoyphoto.designpattern.factory;

/**
 * Created by Administrator on 2018/1/3.
 */
public class HumanFactory implements AbstractHumanFactory{

    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;

        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
