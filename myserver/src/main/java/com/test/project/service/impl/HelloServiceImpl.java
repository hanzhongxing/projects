package com.test.project.service.impl;

import com.test.project.service.DaoService;
import com.test.project.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hanzhongxing on 2018/4/8.
 */
public class HelloServiceImpl implements HelloService {
 private final static Logger logger= LoggerFactory.getLogger(HelloServiceImpl.class);

    private DaoService daoService;
    
    public String hello() {
        logger.info("hello");
        return  daoService.Operator("hello");
    }

    public void setDaoService(DaoService daoService) {
        this.daoService = daoService;
    }
}
