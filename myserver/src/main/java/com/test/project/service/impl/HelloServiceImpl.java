package com.test.project.service.impl;

import com.test.project.service.DaoService;
import com.test.project.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hanzhongxing on 2018/4/8.
 */
public class HelloServiceImpl implements HelloService {

    @Autowired
    private DaoService daoService;
    
    public String hello() {
        return "hello";
    }






}
