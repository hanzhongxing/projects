package com.test.project.service.impl;

import com.test.project.dao.Dao;
import com.test.project.service.DaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hanzhongxing on 2018/4/8.
 */
public class DaoServiceImpl implements DaoService {
    private final static Logger logger= LoggerFactory.getLogger(DaoServiceImpl.class);

    private Dao dao;
    @Override
    public String Operator(String str) {
        logger.info("DaoServiceImpl :"+str);
        return str;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
