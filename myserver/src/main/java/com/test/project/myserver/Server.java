package com.test.project.myserver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by hanzhongxing on 2018/4/8.
 */
public class Server {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubbo-provider.xml") ;
        ac.start();
        System.out.println("myserver start");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
